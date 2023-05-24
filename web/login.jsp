<%--
  Created by IntelliJ IDEA.
  User: Jasmine-drs
  Date: 2023/5/12
  Time: 10:07
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>商城登录注册页面</title>
    <link rel="stylesheet" href="static/css/login.css">
</head>
<body>
<div class="head">
    <div class="shouye_head">
    <a href="index.jsp">商城首页</a>
    </div>
</div>
<section>
    <!--登录-->
    <div class="container">
        <div class="user singinBx">
            <div class="imgBx"><img src="static/image/1.jpg" alt=""></div>
            <div class="formBx">
                <form action="${pageContext.request.contextPath}/login" method="post">
                    <h1>登录</h1>
                    <input type="text" id="account" name="account" placeholder="帐号">
                    <input type="password" id="password" name="password" placeholder="密码">
                    <input type="submit" name="" value="登录">
                    <p class="signup">没有账号？<a href="#" onclick="topggleForm();">注册</a></p>
                </form>
            </div>
        </div>
    <!--注册-->
        <div class="user singupBx">
            <div class="formBx">
                <form action="${pageContext.request.contextPath}/regist" method="post">
                    <h1>注册</h1>
                    <input type="text" id="username" name="username" placeholder="请输入用户名">
                    <input type="password" id="pwd" name="password" placeholder="请输入密码">
                    <input type="password" id="second_pwd" name="second_pwd" placeholder="请再次输入密码">
                    <input type="text" id="phone" name="phone" placeholder="手机号码">
                    <input type="text" id="address" name="address" placeholder="收货地址">
                    <input type="submit" name="" value="注册">
                    <p class="signup">已有账号？<a href="#" onclick="topggleForm();">登录</a></p>
                </form>
            </div>
            <div class="imgBx"><img src="static/image/2.jpg" alt=""></div>
        </div>
    </div>
</section>
<script type="text/javascript">
    function topggleForm(){
        var container=document.querySelector('.container');
        container.classList.toggle('active');
    }
</script>
</body>
</html>
