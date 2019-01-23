package com.zkr.wbb.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.zkr.wbb.dto.request.ApiRequest;
import com.zkr.wbb.dto.response.ApiResponse;
import com.zkr.wbb.exception.ApiException;
import com.zkr.wbb.mapper.CustomerDao;
import com.zkr.wbb.mapper.JdAuthenNameDao;
import com.zkr.wbb.service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: CTC
 * @Date: 2019/1/22 17:11
 * @Description:
 */
@Service
public class ApiServiceImpl implements ApiService {

    private static Logger logger = LoggerFactory.getLogger(ApiServiceImpl.class);

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private JdAuthenNameDao jdAuthenNameDao;

    @Override
    public ApiResponse apiservice10000(ApiRequest apiRequest) {
        List username = customerDao.selectList(Condition.create().eq("username", "15664008013"));


        return ApiResponse.genResponse(username);
    }

    @Override
    public ApiResponse apiservice10001(ApiRequest apiRequest) {
        logger.info("jinlail");

        throw new ApiException("预知的异常", "666");

    }
}
