<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/16
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action08</title>
</head>
<body>
<form:form modelAttribute="person" action="action08">
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
</body>
</html>
