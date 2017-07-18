<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/16
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>系统登录</title>
    <link href="commonlib/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="css/login.css" type="text/css" rel="stylesheet">
    <script src="commonlib/jquery/jquery-3.2.1.min.js"></script>
    <script src="commonlib/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <img src="sources/image/logo.jpg" class="img-rounded">
    <p class="bg-success">湘能楚天电力维护系统</p>
    <div class="col-md-2 col-center-block col-border">
        <form action="login" method="get">
            <div class="form-group">
                <input type="text" class="form-control" id="account" name="account" placeholder="用户名">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" id="psw" name="psw" placeholder="密码">
            </div>
            <button type="submit" class="btn btn-info login-btn">确定</button>
        </form>
    </div>
</div>
</body>
</html>
