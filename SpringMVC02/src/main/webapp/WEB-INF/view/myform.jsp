<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/9
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>List与数组直接绑定自定义数据类型与AJAX</title>
</head>
<body>
    <button type="button" onclick="addPdts_click1()">向服务器发送json</button>
    <button type="button" onclick="addPdts_click2()">接收服务器返回json</button>

    <p id="msg1"></p>
    <p id="msg2"></p>



    <script type="text/javascript" src="<c:url value="/scripts/jQuery1.11.3/jquery-1.11.3.min.js"/>"></script>
    <script type="text/javascript">
       var products = new Array();
        products.push({
            id:1,
            name: "iphone 6 plus",
            price:7788.66
        });
        products.push({
            id:2,
            name: "iphone 7 plus",
            price:8888.66
        });
        products.push({
            id:3,
            name: "iphone 8 plus",
            price:9999.66
        });
        products.push({
            id:4,
            name: "iphone 6 plus",
            price:101012.66
        });

       function addPdts_click1() {
           $.ajax({
               type : "POST",
               //请求谓词类型
               url : "/foo/action10",
               data : JSON.stringify(products), //将products对象转换成json字符串
               contentType : "application/json;charset=UTF-8",
               //发送信息至服务器时内容编码类型，(默认: "application/x-www-form-urlencoded")
               dataType : "text", //预期服务器返回的数据类型
               success : function(result) {
                   $("#msg1").html(result);
               }
           });
       }
        
        function addPdts_click2() {
            $.ajax({
                type:"POST",
                //请求谓词类型
                url:"/foo/action11",
                data:JSON.stringify(products), //将products对象转换为json字符串
                contentType:"application/json;charset=UTF-8",
                //发送信息至服务器时内容编码类型,(默认:"application/x-www-form-urlencoded")
                dataType:"json", //预期服务器返回的数据类型
                success:function (result) {
                    var str = "";
                    $.each(result, function(i, obj) {
                        str += "编号：" + obj.id + ",名称：" + obj.name + ",价格："+ obj.price + "<br/>";
                    });
                    $("#msg2").html(str);
                }
            });
        }
    </script>



</body>
</html>
