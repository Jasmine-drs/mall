<%--
  Created by IntelliJ IDEA.
  User: Jasmine-drs
  Date: 2023/5/19
  Time: 19:21
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>商品页面</title>
    <%--css--%>
    <link rel="stylesheet" href="../static/css/common.css">
    <link rel="stylesheet" href="../static/css/category.css">
    <%--js--%>
    <script src="../static/js/common.js"></script>
</head>
<body>
<!-- 引入头部模块 -->
<jsp:include page="../header.jsp" />

<div class="commodity-container">
    <%-- 渲染商品信息 --%>
    <c:forEach var="commodity" items="${requestScope.commodityList}">
        <div class="commodity-card">
            <img class="commodity-image" src="../${commodity.imageUrl}" alt="${commodity.name}">
            <h2 class="commodity-name">${commodity.name}</h2>
            <p class="commodity-price">价格：￥${commodity.price}</p>
        </div>
    </c:forEach>
</div>
</body>
</html>

