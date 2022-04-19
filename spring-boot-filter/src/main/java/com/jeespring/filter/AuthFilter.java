package com.jeespring.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * AuthFilter
 *
 * @author 张朝阳
 * @date 2022/4/14 3:45 下午
 */
@Slf4j
@WebFilter(urlPatterns = "/*")
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String token = req.getHeader("token");
        if (token != null) {
            log.info("认证成功");
            filterChain.doFilter(request, response);
        } else {
            log.info("认证失败");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
