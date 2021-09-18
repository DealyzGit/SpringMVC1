<%--
  Created by IntelliJ IDEA.
  User: Dealyz
  Date: 2021/9/7
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登录页面</h1>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type=""text name="username">
    <input type="submit" value="提交">
</form>
</body>
</html>
