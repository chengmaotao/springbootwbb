package com.zkr.wbb.exception;

import lombok.Data;

/**
 * @Auther: CTC
 * @Date: 2019/1/22 17:09
 * @Description:
 */
@Data
public class ApiException extends RuntimeException{

    private String message;
    private String errCode;

    public ApiException() {
    }

    public ApiException(String message,String errCode){
        this.message = message;
        this.errCode = errCode;
    }


}
