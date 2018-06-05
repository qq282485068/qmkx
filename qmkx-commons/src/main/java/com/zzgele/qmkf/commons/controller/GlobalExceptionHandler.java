package com.zzgele.qmkf.commons.controller;

import com.zzgele.qmzb.common.exceptions.BizException;
import com.zzgele.qmzb.common.util.WebUtil;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.zzgele.qmzb.common.constant.Constants.HEAD_NO_PERMISSION_KEY;
import static com.zzgele.qmzb.common.constant.Constants.HEAD_NO_PERMISSION_VALUE;


/**
 * @author: HaijunLiu
 * @email: isaiah@@sohu.com
 * @description Web层异常处理器
 * @date: 2018/1/31 13:24
 * @mofified By: 
 * @version 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static final  String ERROR_VIEW = "error";
    public static final  String DEFAULT_ERROR_VIEW = "error";

    public static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 处理业务异常
     * @param request
     * @param response
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    public ModelAndView bizExceptionHandle(HttpServletRequest request, HttpServletResponse response, BizException e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e.getMsg());
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(ERROR_VIEW);
        LOGGER.error("Controller层发生业务异常：",e);
        return mav;
    }

    /**
     * 处理系统异常
     * @param request
     * @param response
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView sysExceptionHandle(HttpServletRequest request, HttpServletResponse response, Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e.getMessage());
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        LOGGER.error("Controller层发生系统异常：",e);
        return mav;
    }


    /**
     * 处理未许可异常(资源无访问权限)
     * @param ex
     * @param request
     * @param response
     * @throws Exception
     */
    @ExceptionHandler({UnauthorizedException.class})
    public void handlerUnauthorizedException(UnauthorizedException ex,
                                                HttpServletRequest request,
                                                HttpServletResponse response) throws Exception {
        if(WebUtil.isAjaxRequest(request)){
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);//无权限异常  主要用于ajax请求返回
            response.setHeader(HEAD_NO_PERMISSION_KEY, HEAD_NO_PERMISSION_VALUE);
            response.setContentType("text/html;charset=utf-8");
            response.sendRedirect("/403");
        }else {
            response.sendRedirect("/403");
        }
    }
}
