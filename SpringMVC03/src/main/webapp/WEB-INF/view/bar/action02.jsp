<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/16
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action02</title>
</head>
<body>
<form:form modelAttribute="person" action="action03">
    <p>
        <label for="name">婚否：</label>
        <form:checkbox path="isMarried" />
    </p>
    <p>
        <label for="name">爱好：</label>
        <form:checkbox path="hobbies" value="读书"/>读书
        <form:checkbox path="hobbies" value="上网"/>上网
        <form:checkbox path="hobbies" value="电影"/>电影
    </p>
    <p>
        <label for="name">毕业：</label>
        <form:checkbox path="education" value="本科"/>大学本科
    </p>
    <p>
        <button>提交</button>
    </p>
</form:form>
<hr/>
<p>渲染后的视图如下：</p>
<form id="person" action="action03" method="post">
    <p>
        <label for="name">婚否：</label>
        <input id="isMarried1" name="isMarried" type="checkbox" value="true"/><input type="hidden" name="_isMarried" value="on"/>
    </p>
    <p>
        <label for="name">爱好：</label>
        <input id="hobbies1" name="hobbies" type="checkbox" value="读书"/><input type="hidden" name="_hobbies" value="on"/>读书
        <input id="hobbies2" name="hobbies" type="checkbox" value="上网"/><input type="hidden" name="_hobbies" value="on"/>上网
        <input id="hobbies3" name="hobbies" type="checkbox" value="电影"/><input type="hidden" name="_hobbies" value="on"/>电影
    </p>
    <p>
        <label for="name">毕业：</label>
        <input id="education1" name="education" type="checkbox" value="本科"/><input type="hidden" name="_education" value="on"/>大学本科
    </p>
    <p>
        <button>提交</button>
    </p>
</form>
</body>
</html>
