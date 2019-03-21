package com.neusoft.fristapp.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Title: title
 * Description: 1.新建一个class，这里取名为 GlobalDefaultExceptionHandler
 *              2.在class上添加注解，@ControllerAdvice
 *              3.在class上添加一个方法
 *              4.在方法上添加@ExceptionHandler拦截相应异常信息。
 *              5.如果返回是View，方法的返回值为ModelAndView。
 *              6.如果返回值是String或者JSON数据，则需要在方法上添加@ResponseBody注解
 * Created on 2019/3/19
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest request,Exception e){
        //返回的是String
        return "对不起，服务器繁忙，请稍后再试";
    }
}
