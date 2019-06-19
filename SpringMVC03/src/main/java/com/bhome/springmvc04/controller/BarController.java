package com.bhome.springmvc04.controller;

import com.bhome.springmvc04.entites.Person;
import com.bhome.springmvc04.entites.Product;
import com.bhome.springmvc04.entites.ProductType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/bar")
public class BarController {

    @RequestMapping(value = "/action01")
    public  String  action01(Model model){
        //向模型中添加一个名为product的对象，用于渲染视图
        model.addAttribute("product",new Product(1,"苹果X",6666.33));
//        model.addAttribute("product",new Product());
        return "bar/action01";
    }

    //checkbox
    @RequestMapping("/action02")
    public String action02(Model model){
        model.addAttribute("person", new Person());
        return "bar/action02";
    }

    @RequestMapping("/action03")
    @ResponseBody
    public Person action03(HttpServletResponse response, Person person){
        return person;
    }

    @RequestMapping(value = "/action04")
    public String  action04(Model model){
        model.addAttribute("persion",new Person());
        return "bar/action04";
    }

    @RequestMapping(value = "/action05")
    @ResponseBody
    public Person  action05(HttpServletResponse response,Person person){
        return person;
    }

    @RequestMapping(value = "/action06")
    public String  action06(Model model){
        Person person = new Person();
        person.setEducation("edu");
        model.addAttribute("person",person);
        return "bar/action06";
    }

    //select 下拉列表
    @RequestMapping(value = "/action07")
    public  String  action07(Model model){
        List<ProductType>  productTypes = new ArrayList<ProductType>();
        productTypes.add(new ProductType(11, "数码电子"));
        productTypes.add(new ProductType(21, "鞋帽服饰"));
        productTypes.add(new ProductType(31, "图书音像"));
        productTypes.add(new ProductType(41, "五金家电"));
        productTypes.add(new ProductType(51, "生鲜水果"));
        model.addAttribute("productTypes", productTypes);
        model.addAttribute("person", new Person());
        return "bar/action07";
    }


    @RequestMapping("/action08")
    @ResponseBody
    public Person action08(HttpServletResponse response,Person person){
        return person;
    }



    //option
    @RequestMapping("/action09")
    public String action09(Model model){
        model.addAttribute("person", new Person());
        return "bar/action09";
    }

    @RequestMapping("/action10")
    @ResponseBody
    public Person action10(HttpServletResponse response,Person person){
        return person;
    }

    //options
    @RequestMapping("/action11")
    public String action11(Model model){
        List<ProductType>  productTypes = new ArrayList<ProductType>();
        productTypes.add(new ProductType(11, "数码电子"));
        productTypes.add(new ProductType(21, "鞋帽服饰"));
        productTypes.add(new ProductType(31, "图书音像"));
        productTypes.add(new ProductType(41, "五金家电"));
        productTypes.add(new ProductType(51, "生鲜水果"));
        model.addAttribute("productTypes", productTypes);
        model.addAttribute("person", new Person());
        return "bar/action11";
    }

    @RequestMapping("/action12")
    @ResponseBody
    public Person action12(HttpServletResponse response,Person person){
        return person;
    }


    //hidden
    @RequestMapping("/action13")
    public String action13(Model model){
        Person person=new Person();
        person.setEducation("99");
        model.addAttribute("person", person);
        return "bar/action13";
    }

    @RequestMapping("/action14")
    @ResponseBody
    public Person action14(HttpServletResponse response,Person person){
        return person;
    }


    //radiobuttons,checkboxs
    @RequestMapping("/action15")
    public String action15(Model model) {
        List<ProductType> productTypes = new ArrayList<ProductType>();
        productTypes.add(new ProductType(11, "数码电子"));
        productTypes.add(new ProductType(21, "鞋帽服饰"));
        productTypes.add(new ProductType(31, "图书音像"));
        productTypes.add(new ProductType(41, "五金家电"));
        productTypes.add(new ProductType(51, "生鲜水果"));
        model.addAttribute("productTypes", productTypes);
        model.addAttribute("person", new Person());
        return "bar/action15";
    }

    @RequestMapping("/action16")
    @ResponseBody
    public Person action16(HttpServletResponse response, Person person) {
        return person;
    }
}
