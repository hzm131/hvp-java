package com.hzm.config;

import com.hzm.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    /**
     * 重写添加拦截器方法
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        InterceptorRegistration loginRegistry = registry.addInterceptor(new LoginHandlerInterceptor());
        // 拦截路径
        loginRegistry.addPathPatterns("/**");
        // 排除路径
        loginRegistry.excludePathPatterns("/");
        loginRegistry.excludePathPatterns("/user/login");
        loginRegistry.excludePathPatterns("/user/loginout");
        loginRegistry.excludePathPatterns("/user/registered");
        // 排除资源请求
        loginRegistry.excludePathPatterns("/css/login/*.css");
        loginRegistry.excludePathPatterns("/js/login/**/*.js");
        loginRegistry.excludePathPatterns("/image/login/*.png");
    }

}