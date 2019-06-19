<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/19
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>bar/action09</title>
</head>
<body>
    <form:form modelAttribute="person" action="action10">
        <p>
            <label for="name">学历：</label>
            <form:select path="education">
                <form:option value="" >--请选择--</form:option>
                <form:option value="大专">大专</form:option>
                <form:option value="本科">本科</form:option>
                <form:option value="研究生">研究生</form:option>
            </form:select>
        </p>
        <p>
            <button>提交</button>
        </p>
    </form:form>

<p>渲染后的页面：</p>

    <form id="person" action="action10" method="post">
        <p>
            <label for="name">学历：</label>
            <select id="education" name="education">
                <option value="">--请选择--</option>
                <option value="大专">大专</option>
                <option value="本科">本科</option>
                <option value="研究生">研究生</option>
            </select>
        </p>
        <p>
            <button>提交</button>
        </p>
    </form>
</body>
</html>
