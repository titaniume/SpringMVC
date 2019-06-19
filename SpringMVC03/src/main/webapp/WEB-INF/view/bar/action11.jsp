<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/19
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action11</title>
</head>
<body>
<form:form modelAttribute="person" action="action12">
    <p>
        <label for="name">产品类型：</label>
        <form:select path="education">
            <form:option value="">--请选择--</form:option>
            <form:options items="${productTypes}" itemLabel="name" itemValue="id"/>
        </form:select>
    </p>
    <p>
        <button>提交</button>
    </p>
</form:form>
<p>渲染后的页面：</p>
<form id="person" action="action12" method="post">
    <p>
        <label for="name">产品类型：</label>
        <select id="education" name="education">
            <option value="">--请选择--</option>
            <option value="11">数码电子</option>
            <option value="21">鞋帽服饰</option>
            <option value="31">图书音像</option>
            <option value="41">五金家电</option>
            <option value="51">生鲜水果</option>
        </select>
    </p>
    <p>
        <button>提交</button>
    </p>
</form>
</body>
</html>
