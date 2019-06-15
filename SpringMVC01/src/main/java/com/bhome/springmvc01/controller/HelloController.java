package com.bhome.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    /**
     * 动作 action
     * @param model
     * @return
     */
    @RequestMapping(value = "/hi")
    public String sayHi(Model model){
        //向模型中添加属性msg与值，将与页面模板渲染后输出
        model.addAttribute("msg","say Hello World!");
        return "hi";
    }
}
