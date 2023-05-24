
<%--
  Created by IntelliJ IDEA.
  User: Jasmine-drs
  Date: 2023/5/12
  Time: 9:05
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <%--引入css--%>
    <link rel="stylesheet" type="text/css" href="static/css/index.css">
    <%--引入js--%>
    <link rel="stylesheet" href="static/js/bootstrap-5.3.0-alpha3-dist/css/bootstrap.min.css">
    <script src="static/js/bootstrap-5.3.0-alpha3-dist/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 引入头部模块 -->
<div>
<jsp:include page="header.jsp" />
</div>
<%--中间部分+商品列表--%>
<div class="center-shoppinglist">
<%--中间部分--%>
<div class="center">
<!-- 商品种类菜单栏 -->
<div class="types">
    <span class="types-h2"><h2>&nbsp分类</h2></span>
<ul>
    <li><a href="${pageContext.request.contextPath}/category/all?categoryId=1">电脑/配件</a></li>
    <li><a href="client/category.jsp?category=2">手机/配件</a></li>
    <li><a href="client/category.jsp?category=3">摄影器材</a></li>
    <li><a href="client/category.jsp?category=4">视频设备</a></li>
    <li><a href="client/category.jsp?category=5">家电产品</a></li>
</ul>
</div>
<%--    中央轮播图--%>
<div class="container" id="container">
    <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel" data-bs-interval="3000">
        <ol class="carousel-indicators">
            <%--这里添加图片列表--%>
            <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"></li>
            <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"></li>
            <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <%--这里添加对应的图片--%>
            <div class="carousel-item active">
                <img src="static/image/O1CN01Sf6dER1zbJ3uVQ0lE_!!6000000006732-0-tps-846-472.webp" class="d-block w-100" alt="Slide 1">
            </div>
            <div class="carousel-item">
                <img src="static/image/O1CN01wlWxdk1XryKCqlxrj_!!6000000002978-0-octopus.webp" class="d-block w-100" alt="Slide 2">
            </div>
            <div class="carousel-item">
                <img src="static/image/O1CN01WZzifX1jZRh1U11su_!!6000000004562-0-octopus.webp" class="d-block w-100" alt="Slide 3">
            </div>
        </div>
        <%--这两个a标签不用动--%>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </a>
    </div>
</div>
<%--    登录显示--%>
    <div></div>
</div>
<%--    商品列表--%>
    <div></div>
</div>
</body>
</html>

