<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/16
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action01</title>
</head>
<body>

<form:form modelAttribute="product">
    <p>
        <label for="id">id：</label>
        <form:input path="id" />
    </p>
    <p>
        <label for="name">名称：</label>
        <form:input path="name" cssClass="textClass" cssStyle="color:blue" a="b"  htmlEscape="false"/>
    </p>
    <p>
        <label for="price">价格：</label>
        <form:input path="price" />
    </p>
</form:form>


<hr/>
<p>渲染后的视图如下：</p>
<form id="product" action="/bar/action01" method="post">
    <p>
        <label for="name">名称：</label>
        <input id="name" name="name" type="text" value="1"/>
    </p>
    <p>
        <label for="name">名称：</label>
        <input id="name" name="name" type="text" value="苹果XR"/>
    </p>
    <p>
        <label for="price">价格：</label>
        <input id="price" name="price" type="text" value="666.0"/>
    </p>
</form>
</body>
</html>
