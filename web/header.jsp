<%--
  Created by IntelliJ IDEA.
  User: Jasmine-drs
  Date: 2023/5/20
  Time: 11:22
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>头部</title>
    <link rel="stylesheet" type="text/css" href="static/css/common.css">
    <script src="static/js/common.js"></script>

</head>
<body>
<!-- 用户头像 -->
<div class="user-avatar" onmouseover="showDropdownMenu()" onmouseout="hideDropdownMenu()">
    ${sessionScope.user.name.substring(0, 1)}
    <!-- 下拉菜单 -->
    <div class="dropdown-menu" id="dropdownMenu">
        <a href="#">个人中心</a>
        <a href="#">修改密码</a>
        <a href="#">退出登录</a>
    </div>
</div>
<%--跳转登录页--%>
<div class="top">
    <ul>
        <li>
            <span class="top-c">中国大陆</span>
            <span class="top-c-c">&nbsp|&nbsp</span>
        </li>
        <li class="top-login-sign">
        <c:if test="${empty sessionScope.user}">
            <a href="login.jsp" class="top-login">请登录</a>
            <a href="#" class="top-sign">&nbsp请注册</a>
        </c:if>
        </li>
    </ul>
    <%--TODO 导航栏--%>
    <ul class="top-nav">
        <a href="index.jsp">首页</a><%--    可以搞个图标--%>
        <a href="client/cart.jsp">购物车</a>
        <a href="client/order.jsp">订单</a>
        <a href="client/user.jsp">个人中心</a>
        <a href="client/#">退出登录</a><%--退出登录之后从后台跳转到首页--%>
    </ul>
</div>

<%--TODO 搜索栏，根据商品分类、商品名进行搜索，开发完这个功能就把TODO删掉--%>
<div class="second">
    <h2>测试</h2>
    <img src="static/image/logo.jpg" class="second-img">
    <div class="second-search">
        <form class="search-form" action="search.jsp" method="get">
            <input type="text" name="keyword" placeholder="搜索商品" class="keyword" >
            <button type="submit" class="btn">搜索</button>
        </form>
    </div>
</div>
</body>
</html>
