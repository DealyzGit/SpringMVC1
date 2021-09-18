<%--
  Created by IntelliJ IDEA.
  User: Dealyz
  Date: 2021/9/7
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>首页</h1>
<span>用户名：${userLoginInfo}</span>



<p>
    <a href="${pageContext.request.contextPath}/user/goOut">注销</a>
</p>
</body>
</html>
