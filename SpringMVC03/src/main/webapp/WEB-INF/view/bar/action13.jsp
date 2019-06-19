<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/19
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action13</title>
</head>
<body>
<form:form modelAttribute="person" action="action14">
    <p>
        <form:hidden path="education" />
        <input type="hidden" value="1" name="id">
    </p>
    <p>
        <button>提交</button>
    </p>
</form:form>
<p>渲染后的页面：</p>
<form id="person" action="action14" method="post">
    <p>
        <input id="education" name="education" type="hidden" value="99"/>
        <input type="hidden" value="1" name="id">
    </p>
    <p>
        <button>提交</button>
    </p>
</form>
</body>
</html>
