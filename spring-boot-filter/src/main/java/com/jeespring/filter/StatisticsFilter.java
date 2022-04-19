package com.jeespring.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * StatisticsFilter
 *
 * @author 张朝阳
 * @date 2022/4/14 3:40 下午
 */
@Slf4j
@Component
public class StatisticsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        log.info("StatisticsFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long beginTime = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        long endTime = System.currentTimeMillis();
        log.info("执行耗时：{} ms", endTime - beginTime);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        log.info("StatisticsFilter destroy");
    }
}
