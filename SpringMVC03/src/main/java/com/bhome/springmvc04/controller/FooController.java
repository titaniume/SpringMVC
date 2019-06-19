package com.bhome.springmvc04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/foo")
public class FooController {

    /**
     * 自动参数映射
     * @param model
     * @param id
     * @param name
     * @return
     */
    @RequestMapping(value = "/action0")
    public String action0(Model model,String  id,String  name){
        model.addAttribute("product","name="+name+",id="+id);
        return "foo/index";
    }
}
