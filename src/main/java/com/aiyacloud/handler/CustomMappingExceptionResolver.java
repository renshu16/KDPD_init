package com.aiyacloud.handler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义的全局异常处理类
 */
public class CustomMappingExceptionResolver extends SimpleMappingExceptionResolver {

    private static Logger logger = LoggerFactory.getLogger(CustomMappingExceptionResolver.class);

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                              Exception ex) {

        logger.error("请求悲剧了！！", ex);

        return super.doResolveException(request, response, handler, ex);
    }

}
