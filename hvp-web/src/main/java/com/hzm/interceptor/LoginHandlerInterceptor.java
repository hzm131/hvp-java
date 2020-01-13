package com.hzm.interceptor;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //检查每个到来的请求对应的session域中是否有登录标识
        Object sessionId = request.getSession().getAttribute("sessionId");
        if (null == sessionId || !(sessionId instanceof String)) {
            // 未登录，重定向到登录页
            System.out.println("未登录");
            return false;
        }
        System.out.println("当前用户已登录，登录的用户名为： " + sessionId);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
