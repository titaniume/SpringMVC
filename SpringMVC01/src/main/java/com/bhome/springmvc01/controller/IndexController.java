package com.bhome.springmvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/home")
public class IndexController {

    @RequestMapping(value = {
            "",
            "/page",
            "page*",
            "view/*",
            "**/msg"
    })
    String indexMultipleMapping(){
        return "Hello from index multiple maping";
    }

    @RequestMapping(method = RequestMethod.GET)
    String get(){
        return  "Hello from get";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    String delete(){
        return  "Hello from delete";
    }

    @RequestMapping(method = RequestMethod.POST)
    String post() {
        return "Hello from post";
    }
    @RequestMapping(method = RequestMethod.PUT)
    String put() {
        return "Hello from put";
    }
    @RequestMapping(method = RequestMethod.PATCH)
    String patch() {
        return "Hello from patch";
    }



}
