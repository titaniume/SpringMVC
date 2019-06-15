package com.bhome.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "val")
public class ValiableController {


    // 请求内容类型必须为text/html，注意浏览器默认没有指定Content-type
    @RequestMapping(value = "/action1",consumes = "text/html")
    public  String action1(Model model){
        model.addAttribute("message", "请求的提交内容类型（Content-Type）是text/html");
        return "foo/index";
    }

    @RequestMapping(value = "/action2",produces="application/json; charset=UTF-8")
    public  String action2(Model model){
        model.addAttribute("message","客户端可以接收的类型是application/json; charset=UTF-8");
        return "foo/index";
    }

    @RequestMapping(value = "/action3",params = {"id=123","name!=abc"})
    public String action3(Model model){
        model.addAttribute("message", "请求的参数必须包含id=123与name不等于abc");
        return "foo/index";
    }

    @RequestMapping(value = "/action4",headers = "Host=localhost:8080")
    public String action4(Model model){
        model.addAttribute("message", "请求头部信息中必须包含Host=localhost:8080");
        return "foo/index";
    }

    @RequestMapping(path ={"/action5","/myaction"},name = "actionTest")
    public  String  action5(Model model){
        model.addAttribute("message", "映射访问路径为/action5或/myaction，指定映射名称为actionTest");
        return "foo/index";
    }

    @RequestMapping(value = "/action6",method = RequestMethod.GET)
    public String action6(Model model){
        model.addAttribute("msg","action6 get请求");
        return "hi";
    }

    @GetMapping("/action7")
    public String action7(Model model){
        model.addAttribute("msg","action7 get请求");
        return "hi";
    }
}
