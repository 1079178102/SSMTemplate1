<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/22
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="/user/login" method="post">
        用户名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>
        <input type="submit" value="登录">
    </form>
    <hr>
    <form action="/user/register" method="post">
        用户名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
