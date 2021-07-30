package com.baogex.spring.cloud.shop.common.verifier;

import com.baogex.spring.cloud.shop.common.response.Response;
import com.baogex.spring.cloud.shop.common.response.RestResponse;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
public class RestResponseV {
    public static <T> Response<T> returnIfPresent(T result) {
        if (result != null) {
            return RestResponse.buildSuccess(result);
        }
        return RestResponse.notResourceFail();
    }
}
