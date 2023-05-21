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
<!-- 用户头像 -->
<div class="user-avatar">
    ${sessionScope.user.name.substring(0, 1)}
</div>
<div class="sidebar">
    <ul>
        <li><a href="#" id="commodity">商品管理</a></li>
        <li><a href="#" id="orders">订单管理</a></li>
        <li><a href="#" id="user">用户管理</a></li>
        <li><a href="#" id="inventory">库存管理</a></li>
        <li><a href="#" id="statistics">数据统计</a></li>
    </ul>
</div>
<div class="content">
    <iframe src="welcome.jsp" style="display: block;" height="100%" ></iframe>
</div>
</body>
</html>
<script>
    // 获取菜单项的引用
    var menuItems = document.querySelectorAll(".sidebar ul li a");

    // 为每个菜单项添加点击事件监听器
    menuItems.forEach(function(menuItem) {
        menuItem.addEventListener("click", function(event) {
            event.preventDefault(); // 阻止默认的页面跳转行为

            // 获取菜单项的标识符或ID
            var menuItemId = event.target.id;

            // 根据菜单项的标识符或ID加载相应的内容到iframe中
            var iframe = document.querySelector("iframe");
            iframe.src = getURLForMenuItem(menuItemId);

            // 调整iframe的样式
            // iframe.style.display = "block";
            // iframe.style.marginTop = "20px";
        });
    });

    // 根据菜单项的标识符或ID返回对应的URL
    function getURLForMenuItem(menuItemId) {
        // 根据菜单项的标识符或ID返回相应的URL
        if (menuItemId === "commodity") {
            return "commodity-management.jsp"; // 返回商品管理页面的URL
        } else if (menuItemId === "orders") {
            return "order-management.jsp"; // 返回订单管理页面的URL
        } else if (menuItemId === "user") {
            return "user-management.jsp"; // 返回用户管理页面的URL
        } else if (menuItemId === "inventory") {
            return "inventory-management.jsp"; // 返回库存管理页面的URL
        } else if (menuItemId === "statistics") {
            return "data-statistics.jsp"; // 返回数据统计页面的URL
        }

        // 如果没有匹配的菜单项标识符或ID，则返回默认的URL
        return "commodity-management.jsp";
    }

</script>