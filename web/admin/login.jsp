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
    <title>后台登录页面</title>
</head>
<body>
<h1>后台登录页面</h1>
<%--登录表单--%>
<form action="${pageContext.request.contextPath}/admin/login" method="post">
    <%--写在表格里面--%>
    <table>
        <input type="hidden" name="identity" value="1">
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" id="username" placeholder="请输入用户名"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" id="password" placeholder="请输入密码"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
