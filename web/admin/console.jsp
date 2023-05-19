<%--
  Created by IntelliJ IDEA.
  User: Jasmine-drs
  Date: 2023/5/14
  Time: 10:59
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>控制台</title>
    <%--引入样式表--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/console.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/common.css">

</head>
<body>
<h1>后台管理系统</h1>
<!-- 用户头像 -->
<div class="user-avatar">
    ${sessionScope.user.name.substring(0, 1)}
</div>
<div class="sidebar">
    <ul>
        <li><a href="#">商品管理</a></li>
        <li><a href="#">订单管理</a></li>
        <li><a href="#">用户管理</a></li>
        <li><a href="#">库存管理</a></li>
        <li><a href="#">数据统计</a></li>
    </ul>
</div>

<div class="content">
    <!-- 页面内容 -->
</div>

</body>
</html>
