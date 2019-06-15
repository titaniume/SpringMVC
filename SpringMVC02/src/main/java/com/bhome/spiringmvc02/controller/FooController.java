

package com.bhome.spiringmvc02.controller;

import com.bhome.spiringmvc02.entites.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/foo")
public class FooController {

        /**
         * 自动映射参数
         * @param model
         * @param name
         * @param id
         * @return
         */
        @RequestMapping(value = "/action0")
        public String action0(Model model,String name,int id){
            model.addAttribute("message","name="+name+",id="+id);
            return "foo/index";
        }

    /**
     * 自动映射自定义数据类型
     * @param model
     * @param product
     * @return
     */
    @RequestMapping(value = "/action1")
    public String action1(Model model, Product product){
        model.addAttribute("message",product);
        return "foo/index";
    }

    /**
     * 复自动参数映射复杂数据类型
     * @param model
     * @param user
     * @return
     */
    @RequestMapping(value ="/action2")
    public String action2(Model model, User user){
        model.addAttribute("message",user.getUsername()+","+user.getProduct().getName());
        return "foo/index";
    }

    /**
     * 自动参数映射数组数据类型
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/action3")
    public String action3(Model model,Integer [] id){
        model.addAttribute("message", Arrays.toString(id));
        return "foo/index";
    }

    /**
     * 实体类接收
     * @param model
     * @param car
     * @return
     */
    @RequestMapping(value = "/action04")
    public String action04(Model model, Car car){
        model.addAttribute("message",car);
        return "foo/index";
    }

    /**
     * 集合类型
     * @param model
     * @param products
     * @return
     */
    @RequestMapping(value = "/action05")
    public String action05(Model model, ProductList products){
        model.addAttribute("message",products.getItems().get(0)+"<br/>"+products.getItems().get(1));
        return "foo/index";
    }

    /**
     * Map类型
     * @return
     */
    @RequestMapping(value = "/action06")
    public String action06(Model model, ProductMap map){
        model.addAttribute("message",map.getItems().get("p1")+"<br/>"+map.getItems().get("p2"));
        return  "foo/index";
    }

    /**
     * 默认值参数绑定
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/action07")
    public String action07(Model model,@RequestParam(required = false,defaultValue = "99")int id){
        model.addAttribute("message",id);
        return "foo/index";
    }

    /**
     * List结合与数组类型
     * @param model
     * @param users
     * @return
     */
    @RequestMapping(value = "/action08")
    public String action08(Model model, @RequestParam("u")List<String > users){
        model.addAttribute("message",users.get(0)+","+ users.get(1)+","+users.get(2));
        return "foo/index";
    }

    /**
     * List与数组绑定基本数据类型
     * @param model
     * @param ids
     * @return
     */
    @RequestMapping(value = "/action09")
    public String action9(Model model,@RequestParam("id") List<Integer> ids){
        model.addAttribute("message",Arrays.deepToString(ids.toArray()));
        return "foo/index";
    }

    /**
     * 跳转到myform.jsp
     * @return
     */
    @RequestMapping(value = "/myform")
    public String  myform(){
        return "myform";
    }



    /**
     * List与数组直接绑定自定义数据类型与Ajax
     * @param products
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/action10")
    public void  action10(@RequestBody List<Product> products, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        System.out.println(Arrays.deepToString(products.toArray()));
        response.getWriter().write("添加成功");
    }


    /**
     * 返回到界面的数据
     * @param products
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/action11")
    @ResponseBody
    public List<Product>  action11(@RequestBody List<Product> products, HttpServletResponse response) throws IOException {
       return  products;
    }

    /**
     * 重定向
     * @return
     */
    @RequestMapping(value = "/action12")
    public String action12(){
        return "foo/index";
    }

    /**
     * 重定向action
     * @return
     */
    @RequestMapping(value = "/action13")
    public String action13(Model model){
        model.addAttribute("message","actiionMessages");
        return "redirect:action12";
    }


    /**
     * 接收重定向参数
     * @param model
     * @param product
     * @return
     */
    @RequestMapping("/action14")
    public String action14(Model model, Product product) {
        model.addAttribute("message", product);
        System.out.println(model.containsAttribute("product")); // true
        return "foo/index";
    }

    /**
     * 重定向属性
     * @param model
     * @param redirectAttributes
     * @return
     */
    @RequestMapping("/action15")
    public String action15(Model model, RedirectAttributes redirectAttributes) {
        Product product = new Product(2, "iPhone7 Plus", 6989.5);
        redirectAttributes.addFlashAttribute("product", product);
        return "redirect:action14";
    }

    /**
     * 转发
     * @return
     */
    @RequestMapping(value = "/action16")
    public String  action16(){
        return  "hi";
    }

    /**
     * 转发
     * @param model
     * @return
     */
    @RequestMapping(value = "/action17")
    public  String  action17(Model model){
        model.addAttribute("msg","action17");
        return "forward:action16";
    }


    @RequestMapping(value = "/action18")
    public String action18(Model model, @ModelAttribute(name = "product", binding = true) Product entity){
        model.addAttribute("message",model.containsAttribute("poduct")+"<br/>"+entity);
        return  "foo/index";
    }

    @RequestMapping(value = "/action19")
    public String action19(Model model) {
        Map<String, Object> map = model.asMap();
        for (String key : map.keySet()) {
            System.out.println(key + "：" + map.get(key));
        }
        return "foo/index";
    }

    @ModelAttribute
    public String noaction() {
        System.out.println("noaction 方法被调用！");
        String message = "来自noaction方法的信息";
        return message;
    }


    @RequestMapping(value = "/action20")
    public String action20(Model model) {
        return "foo/action20";
    }


    @RequestMapping(value = "/action21")
    public  String  action21(Model model){
        model.addAttribute("message","action21");
        return "bar/action21";
    }

    @RequestMapping( value = "/action22")
    @ResponseBody
    public  String  action22(){
        return "not <b>path</b>,but <b>countent</b<";
    }

    @RequestMapping("/action23")
    public void action33()
    {
    }

    @RequestMapping("/action24")
    public String action24()
    {
        return "foo/action23"; //foo是控制器的路径
    }

    @RequestMapping("/action25")
    public void action25(HttpServletResponse response) throws IOException
    {
        response.getWriter().write("<h2>void method</h2>");
    }

    @RequestMapping(value = "/action26")
    public ModelAndView action26(){
        //1只指定视图
        //return new ModelAndView("/bar/index");

        //2分别指定视图与模型
        //Map<String, Object> model=new HashMap<String,Object>();
        //model.put("message", "ModelAndView action35");
        //return new ModelAndView("/bar/index",model);

        //3同时指定视图与模型
        //return new ModelAndView("/bar/index","message","action35 ModelAndView ");

        //4分开指定视图与模型
        ModelAndView modelAndView=new ModelAndView();
        //指定视图名称
        modelAndView.setViewName("/bar/index");
        //添加模型中的对象
        modelAndView.addObject("message", "<h2>Hello ModelAndView</h2>");
        return modelAndView;
    }


    @RequestMapping("/action27")
    public Map<String, Object> action27()
    {
        Map<String, Object> model=new HashMap<String,Object>();
        model.put("message", "Hello Map");
        model.put("other", "more item");
        return model;
    }

    @RequestMapping("/action28")
    @ResponseBody
    public Integer action28()
    {
        return 9527;
    }

    @RequestMapping("/action29")
    @ResponseBody
    public Product action29()
    {
        return new Product(1,"iPhone",1980.5);
    }


    @RequestMapping(value = "/action30")
    public Model action30(Model model){
        model.addAttribute("message","返回值类型是org.springframework.ui.Model");
        return model;
    }


    @RequestMapping("/action31")
    @ResponseBody
    public String action41(HttpServletResponse response)
    {
        response.setHeader("Content-type","application/octet-stream");
        response.setHeader("Content-Disposition","attachment; filename=table.xls");
        return "<table><tr><td>Hello</td><td>Excel</td></tr></table>";
    }

    @RequestMapping(value = "/action32")
    @ResponseBody
    public void  action32(HttpServletResponse response) throws  IOException{

        //POI
        // response.setContentType("text/html;charset=utf-8");
        // response.setCharacterEncoding("utf-8");
        //问题 载xls问题用excel打开乱码，用notepad++等工具转成UTF-8格式(带BOM)可以正常打开。
        //解决：严格来说这并不是xls文件的问题，而是Excel处理文件编码方式问题，Excel默认并不是以UTF-8来打开文件，所以在xls开头加入BOM，告诉Excel文件使用utf-8的编码方式。

        response.setHeader("Content-Type","application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition","attachment;filename=Cars.xls");
        PrintWriter out = response.getWriter();

        //加上bom头,解决excel打开乱码问题
        byte[] bomStrByteArr = new byte[] { (byte) 0xef, (byte) 0xbb, (byte) 0xbf };
        String bomStr = new String(bomStrByteArr, "UTF-8");
        out.write(bomStr);

        StringBuffer str=new StringBuffer("");
        str.append("<table border=1 width=100%>");
        str.append("<tr><th>编号</th><th>名称</th><th>价格</th></tr>");

        for (Car car: Car.cars) {
            str.append("<tr><td>"+car.getId()+"</td><td>"+car.getName()+"</td><td>"+car.getPrice()+"</td></tr>");
        }

        str.append("</table>");
        out.write(str.toString());

    }


    @RequestMapping(value = "/action33")
    @ResponseBody
    public void  action33(HttpServletResponse response) throws IOException{

        //POI
        //response.setContentType("text/html;charset=utf-8");
        //response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition","attachment;filename=Cars.csv");
        PrintWriter out = response.getWriter();
        //加上bom头,解决excel打开乱码问题
        byte[] bomStrByteArr = new byte[] { (byte) 0xef, (byte) 0xbb, (byte) 0xbf };
        String bomStr = new String(bomStrByteArr, "UTF-8");
        out.write(bomStr);


        StringBuffer str=new StringBuffer("");
        str.append("编号,名称,价格\r\n");

        for (Car car: Car.cars) {
            str.append(car.getId()+","+car.getName()+","+car.getPrice()+"\r\n");
        }
        response.getWriter().write(str.toString());
    }



}
