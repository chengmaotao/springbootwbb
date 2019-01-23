package com.zkr.wbb.dto.response;

import com.alibaba.fastjson.JSON;
import com.zkr.wbb.dto.constant.Constant;
import lombok.Data;

/**
 * @Auther: CTC
 * @Date: 2019/1/22 10:28
 * @Description:
 */

@lombok.Getter
@lombok.Setter
public class ApiResponse {
    private String code = Constant.SUCCESS;
    private String errorMessage = "";
    private String responsePacket = "";


    public static ApiResponse genResponse(Object packet){
        ApiResponse apiResponse = new ApiResponse();

        String resPacketJSON = JSON.toJSONString(packet);

        apiResponse.setResponsePacket(resPacketJSON);

        return apiResponse;

    }

}
