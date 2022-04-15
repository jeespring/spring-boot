package com.jeespring.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * AuthInterceptor
 *
 * @author 张朝阳
 * @date 2022/4/14 10:17 上午
 */
@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {

    /**
     * 在请求rest接口之前调用
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        HttpSession session = request.getSession();
        log.info("AuthInterceptor 请求url:[{}]", request.getRequestURL());
        // 获取登录的 token 信息
        String token = (String) session.getAttribute("token");
        if (StringUtils.isEmpty(token)) {
            log.info("当前用户未登录，请重新登录");
            //未登录自动跳转到登录界面
            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath + "/user/login");
            return false;
        } else {
            return true;
        }
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) {
        log.info("AuthInterceptor postHandle 执行完成");
    }

    /**
     * 在整个请求结束之后被调用
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) {
        log.info("AuthInterceptor afterCompletion 执行完成");
    }
}
