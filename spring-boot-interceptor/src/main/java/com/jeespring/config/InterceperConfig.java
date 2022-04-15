package com.jeespring.config;

import com.jeespring.interceptor.AuthInterceptor;
import com.jeespring.interceptor.LogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * InterceperConfig
 *
 * @author 张朝阳
 * @date 2022/4/14 10:24 上午
 */
@Configuration
public class InterceperConfig implements WebMvcConfigurer {

    @Resource
    private AuthInterceptor authInterceptor;

    @Resource
    private LogInterceptor logInterceptor;

    /**
     * 将 LogInterceptor 和 AuthInterceptor 拦截器加载到执行链中
     * 并且 LogInterceptor 在 AuthInterceptor 执行前执行
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加 LogInterceptor 拦截器
        registry.addInterceptor(logInterceptor)
                // 不需要拦截的请求，多个路径用逗号分隔
                .excludePathPatterns("/user/login", "/user/logout")
                // 需要拦截的请求
                .addPathPatterns("/**")
                // 拦截器执行顺序，order值越小，执行越靠前
                .order(1);

        //添加 AuthInterceptor 拦截器
        registry.addInterceptor(authInterceptor)
                // 不需要拦截的请求，多个路径用逗号分隔
                .excludePathPatterns("/user/login", "/user/logout")
                // 需要拦截的请求
                .addPathPatterns("/**")
                // 拦截器执行顺序，order值越小，执行越靠前
                .order(2);

    }
}
