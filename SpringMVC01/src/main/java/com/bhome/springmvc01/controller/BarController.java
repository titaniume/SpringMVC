package com.bhome.springmvc01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 定义控制器
 * //BarController类的实例是一个控制器，会自动添加到Spring上下文中
 */
@Controller
//@RequestMapping(value = "/foobar")
public class BarController{

    /**
     * 映射访问路径
     * @return
     */
    @RequestMapping("/bar")
    public String index(Model model){

        //SpringMVC会自定实例化一个Model对象用于向视图传值
        model.addAttribute("message","这是通过注解定义的一个controller");
        //返回视图位置
        return  "foo/index";
    }

    @RequestMapping(value ="/action1")
    public  String action1(){
        return "foo/index";
    }

    @RequestMapping("/action2")
    public String action2(Model model){
        //在模型中添加属性message值为action1，渲染页面时使用
        model.addAttribute("message", "action2");
        return "foo/index";
    }

//    @RequestMapping
//    public String action3(Model model){
//        //在模型中添加属性message值为action3，渲染页面时使用
//        model.addAttribute("message", "action3");
//        return "foo/index";
//    }

    @RequestMapping(value = "/action4/{p1}/{p2}")
    public String action4(@PathVariable int p1,@PathVariable int p2,Model model){
        model.addAttribute("message",p1+p2);
        return  "foo/index";
    }

    @RequestMapping(value = "/action5/{id:\\d{6}}-{name:[a-z]{3}}")
    public String action5(@PathVariable int id,@PathVariable String name,Model model){
        model.addAttribute("message","id:{}"+id+"name:{}"+name);
        return "foo/index";
    }

    @RequestMapping(value = "/pets/{petId}")
    public void findPet(@PathVariable String petId, @MatrixVariable int q){

    }

    // 矩阵变量
    @RequestMapping(value = "/action6/{name}")
    public String action6(Model model,
                          @PathVariable String name,   //路径变量，用于获得路径中的变量name的值
                          @MatrixVariable String r,
                          @MatrixVariable(required = true) String g,  //参数g是必须的
                          @MatrixVariable(defaultValue = "99", required = false) String b) {  //参数b不是必须的，默认值是99
        model.addAttribute("message", name + " is #" + r + g + b);
        return "foo/index";
    }

    @RequestMapping(value = "/action7/*.do")
    public String action7(Model model){
        model.addAttribute("message","Ant风格路径模式");
        return  "foo/index";
    }


    //谓词类型POST、DELETE
    @RequestMapping(value = "/action8",method={RequestMethod.POST,RequestMethod.DELETE})
    public String action8(Model model) {
        model.addAttribute("message", "请求谓词只能是POST与DELETE");
        return "foo/index";
    }

    //谓词类型GET
    @RequestMapping(value = "/action9",method=RequestMethod.GET)
    public String action9(Model model) {
        model.addAttribute("message", "请求谓词只能是GET");
        return "foo/index";
    }


}
