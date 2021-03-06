package com.bhome.springmvc01.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义控制器
 */
public class FooController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //返回一个模型视图对象、指定路径、指定模型名称为message、值为字符串
        return new ModelAndView("foo/index","message","Hello,我是通过实现接口的一个控制器");
    }
}




