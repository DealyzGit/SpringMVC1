<%--
  Created by IntelliJ IDEA.
  User: Dealyz
  Date: 2021/9/6
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.6.0.js"
        integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
        crossorigin="anonymous">
</script>
<script>
    function nme(){
        $.post({
            url:"${pageContext.request.contextPath}/a3",
            data:{name:$("#name").val()},
            success:function (data){
                if (data.toString()==="ok"){
                    $("#userInfo").css("color","green")
                }else {
                    $("#userInfo").css("color","red")
                }
                $("#userInfo").html(data)
            }
        })
    }
    function pwd(){
        $.post({
            url:"${pageContext.request.contextPath}/a3",
            data:{pwd:$("#pwd").val()},
            success:function (data){
                if (data.toString()==="ok"){
                    $("#pwdInfo").css("color","green")
                }else {
                    $("#pwdInfo").css("color","red")
                }
                $("#pwdInfo").html(data)
            }
        })

    }
</script>

<p>
    用户名：<input type="text" id="name" onblur="nme()">
    <span id="userInfo"></span>
</p>
<p>
    密码：<input type="text" id="pwd" onblur="pwd()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>
