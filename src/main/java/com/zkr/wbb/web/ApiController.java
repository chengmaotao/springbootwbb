package com.zkr.wbb.web;

import com.zkr.wbb.dto.constant.Constant;
import com.zkr.wbb.dto.request.ApiRequest;
import com.zkr.wbb.dto.response.ApiResponse;
import com.zkr.wbb.exception.ApiException;
import com.zkr.wbb.handler.LocaleMessageHandler;
import com.zkr.wbb.service.ApiService;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: CTC
 * @Date: 2019/1/22 10:26
 * @Description:
 */

@RestController
public class ApiController {

    private static Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private LocaleMessageHandler localeMessageHandler;

    @Autowired
    private ApiService apiService;

    @PostMapping("/1.0/endpoint")
    public ApiResponse handleApiRequest(HttpServletRequest request) {

      String mes =  localeMessageHandler.getMessage("api.error.param.action.missing","zh");

        String mes1 =  localeMessageHandler.getMessage("api.error.param.action.missing","en");

        String mes2 =  localeMessageHandler.getMessage("api.error.param.action.missing","");

        ApiRequest apiRequest = ApiRequest.generate(request, localeMessageHandler);

        apiRequest.validate();

        ApiResponse apiResponse;

        switch (apiRequest.getAction()){
            case Constant.ACTION_10000 :
                apiResponse = apiService.apiservice10000(apiRequest);
                break;
            case  Constant.ACTION_10001 :
                apiResponse = apiService.apiservice10001(apiRequest);
                break;
            default:
                throw new ApiException(localeMessageHandler.getMessage("api.error.param.action.not.found", apiRequest.getLanguage()),Constant.ERROR_BAD_REQUEST);
        }
        //123456789
        return apiResponse;
    }

    @ExceptionHandler(ApiException.class)
    protected ApiResponse handleApiException(final ApiException exception) {

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(exception.getErrCode());
        apiResponse.setErrorMessage(exception.getMessage());

        return apiResponse;
    }


    @ExceptionHandler(Throwable.class)
    protected ApiResponse handleApplicationException(final Throwable throwable) {

        logger.error(ExceptionUtils.getStackTrace(throwable));

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(Constant.ERROR_SERVER_FAILURE);
        apiResponse.setErrorMessage(localeMessageHandler.getMessage("api.error.unknown"));

        return apiResponse;
    }
}
