package com.baogex.spring.cloud.shop.common.response;

import lombok.*;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private boolean success;

    private Integer code;

    private String msg;

    private T date;

    @Getter
    public static enum ResultCode {
        OK(200),
        NOT_RESOURCE(300),
        ERROR(500);
        private int code;

        ResultCode(int code) {
            this.code = code;
        }

    }
}
