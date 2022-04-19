package com.jeespring.config;

import com.jeespring.filter.StatisticsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * FilterConfig
 *
 * @author 张朝阳
 * @date 2022/4/14 3:44 下午
 */
@Configuration
public class FilterConfig {

    @Resource
    private StatisticsFilter statisticsFilter;

    @Bean
    public FilterRegistrationBean registerAuthFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(statisticsFilter);
        registration.addUrlPatterns("/*");
        registration.setName("statisticsFilter");
        registration.setOrder(1);
        return registration;
    }
}
