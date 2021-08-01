package com.baogex.spring.cloud.shop.web.interceptor;

import com.baogex.spring.cloud.shop.web.util.RequestBodyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.PostConstruct;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;

/**
 * @Author: baogex
 * @Date: 2021/8/1
 */
@Component
@Slf4j
public class CommonInterceptor implements HandlerInterceptor {

    @PostConstruct
    public void init() {
        log.info("init CommonInterceptor");
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String bodyStr = RequestBodyUtils.read(request.getInputStream());
        log.info("请求方式[{}],请求路径:[{}],请求参数[{}]，Body[{}]",
                request.getMethod(),
                request.getServletPath(),
                request.getQueryString(),
                bodyStr);
        return true;
    }
}
