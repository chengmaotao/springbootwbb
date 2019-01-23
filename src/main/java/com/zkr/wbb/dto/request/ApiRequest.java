package com.zkr.wbb.dto.request;

import com.zkr.wbb.dto.constant.Constant;
import com.zkr.wbb.exception.ApiException;
import com.zkr.wbb.handler.LocaleMessageHandler;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: CTC
 * @Date: 2019/1/22 16:55
 * @Description:
 */
public class ApiRequest {
    private static Logger logger = LoggerFactory.getLogger(ApiRequest.class);

    private static final String REQ_PARAM_VERSION = "version";

    private static final String REQ_PARAM_ACTION = "action";

    private static final String REQ_PARAM_PACKET = "packet";

    private static final String REQ_PARAM_LANGUAGE = "language";


    private LocaleMessageHandler messageHandler;

    private String version;

    private String action;

    private String packet;

    private String language;


    private ApiRequest(String version,  String action,String packet,  String language) {
        this.version = version;

        this.action = action;

        this.packet = packet;

        this.language = language;

    }

    public static ApiRequest generate(HttpServletRequest request, LocaleMessageHandler messageHandler){

        String versionParam = request.getParameter(REQ_PARAM_VERSION);
        String actionParam = request.getParameter(REQ_PARAM_ACTION);
        String packetParam = request.getParameter(REQ_PARAM_PACKET);
        String languageParam = request.getParameter(REQ_PARAM_LANGUAGE);


        ApiRequest apiRequest = new ApiRequest(versionParam,actionParam,packetParam,languageParam);

        apiRequest.setMessageHandler(messageHandler);
        return apiRequest;

    }

    public void validate() {
        if(StringUtils.isEmpty(action)){
            throw new ApiException(messageHandler.getMessage("api.error.param.action.missing",language),Constant.ERROR_BAD_REQUEST);
        }
    }

    public LocaleMessageHandler getMessageHandler() {
        return messageHandler;
    }

    public void setMessageHandler(LocaleMessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPacket() {
        return packet;
    }

    public void setPacket(String packet) {
        this.packet = packet;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
