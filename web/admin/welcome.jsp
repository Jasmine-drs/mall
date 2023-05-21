<%--
  Created by IntelliJ IDEA.
  User: Jasmine-drs
  Date: 2023/5/21
  Time: 11:04
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>后台管理系统 - 欢迎页</title>
  <style>
    /* 样式调整 */
    body {
      background-color: #333;
      color: #fff;
      font-family: Arial, sans-serif;
      text-align: center;
    }
    .welcome-container {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .welcome-message {
      font-size: 32px;
      margin-bottom: 30px;
    }
    .user-info {
      font-size: 20px;
      margin-bottom: 20px;
    }
    .user-photo {
      width: 150px;
      height: 150px;
      border-radius: 50%;
      object-fit: cover;
      margin-bottom: 20px;
    }
  </style>
</head>
<body>
<div class="welcome-container">
  <h1 class="welcome-message">欢迎登录后台管理系统</h1>
  <img src="../static/image/用户头像.png" alt="管理员照片" class="user-photo">
  <div class="user-info">
    <p>管理员姓名：${sessionScope.user.name}</p>
<%--    <p>角色：${sessionScope.user.role}</p>--%>
    <!-- 其他管理员信息 -->
  </div>
</div>
</body>
</html>

