package com.hzm.config;

import com.hzm.interceptor.FirstInterceptor;
import org.springframework.context.annotation.Configuration;
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
        registry.addInterceptor(new FirstInterceptor())
                .addPathPatterns("/**")
                .order(1);//指定执行顺序，数值越小越优先
    }

}