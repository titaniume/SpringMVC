<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/16
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action04</title>
</head>
<body>
    <form:form modelAttribute="persion" action="action05">
        <p>
            <label for="name">学历：</label>
            <form:radiobutton path="education" value="专科"/>专科
            <form:radiobutton path="education" value="本科"/>本科
            <form:radiobutton path="education" value="研究生"/>研究生
        </p>
        <p>
            <button>提交</button>
        </p>
    </form:form>
<hr/>
<p>渲染结果：</p>
    <form id="person" action="action05" method="post">
        <p>
            <label for="name">学历：</label>
            <input id="education1" name="education" type="radio" value="专科"/>专科
            <input id="education2" name="education" type="radio" value="本科"/>本科
            <input id="education3" name="education" type="radio" value="研究生"/>研究生
        </p>
        <p>
            <button>提交</button>
        </p>
    </form>
</body>
</html>
