<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/16
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bar/action06</title>
</head>
<body>
<form:form modelAttribute="person" >
    <p>
        <label>密码：</label>
        <form:password path="education" showPassword="true"/>
    </p>
</form:form>
<hr/>
<p>
    <label>密码：</label>
    <input id="education" name="education" type="password" value="edu"/>
</p>

</body>
</html>
