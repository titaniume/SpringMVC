<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/19
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action15</title>
</head>
<body>

<form:form modelAttribute="person" action="action16">
    <p>
        <label for="name">产品类型：</label>
        <form:radiobuttons path="education" items="${productTypes}"  itemLabel="name"  itemValue="id" delimiter=","  element="a"/>
    </p>
    <p>
        <label for="name">产品类型：</label>
        <form:checkboxes path="education" items="${productTypes}"  itemLabel="name"  itemValue="id" delimiter="-"/>
    </p>
    <p>
        <button>提交</button>
    </p>
</form:form>

<p>渲染后结果如下：</p>

<form id="person" action="action16" method="post">
    <p>
        <label for="name">产品类型：</label>
        <a><input id="education1" name="education" type="radio" value="11"/><label for="education1">数码电子</label></a><a>,<input id="education2" name="education" type="radio" value="21"/><label for="education2">鞋帽服饰</label></a><a>,<input id="education3" name="education" type="radio" value="31"/><label for="education3">图书音像</label></a><a>,<input id="education4" name="education" type="radio" value="41"/><label for="education4">五金家电</label></a><a>,<input id="education5" name="education" type="radio" value="51"/><label for="education5">生鲜水果</label></a>
    </p>
    <p>
        <label for="name">产品类型：</label>
        <span><input id="education6" name="education" type="checkbox" value="11"/><label for="education6">数码电子</label></span><span>-<input id="education7" name="education" type="checkbox" value="21"/><label for="education7">鞋帽服饰</label></span><span>-<input id="education8" name="education" type="checkbox" value="31"/><label for="education8">图书音像</label></span><span>-<input id="education9" name="education" type="checkbox" value="41"/><label for="education9">五金家电</label></span><span>-<input id="education10" name="education" type="checkbox" value="51"/><label for="education10">生鲜水果</label></span><input type="hidden" name="_education" value="on"/>
    </p>
    <p>
        <button>提交</button>
    </p>
</form>
</body>
</html>
