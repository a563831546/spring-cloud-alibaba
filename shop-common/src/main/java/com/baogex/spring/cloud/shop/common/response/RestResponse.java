package com.baogex.spring.cloud.shop.common.response;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */

public class RestResponse<T> extends Response<T> {

    public static <T> Response<T> buildSuccess(String msg, T data) {
        return new Response<>(true, ResultCode.OK.getCode(), msg, data);
    }

    public static <T> Response<T> buildSuccess(T data) {
        return new Response<>(true, ResultCode.OK.getCode(), "请求成功", data);
    }

    public static <T> Response<T> simpleSuccess() {
        return new Response<>(true, ResultCode.OK.getCode(), "请求成功", null);
    }

    public static <T> Response<T> notResourceFail() {
        return new Response<>(false, ResultCode.NOT_RESOURCE.getCode(), "资源不存在", null);

    }
}
