package servlet.admin;

import bean.User;
import dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jasmine-drs
 * @date 2023/5/14 10:21
 */

@WebServlet(name = "AdminLoginServlet", urlPatterns = "/admin/login")
public class AdminLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        // 1. 获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String identity = req.getParameter("identity");

        UserDaoImpl userDao = new UserDaoImpl();
        User exist = userDao.isExist(username, password, identity);
        System.out.println("exist = " + exist);

        // 2. 验证用户名和密码是否正确
        if (exist.getId() != null) {
            req.setAttribute("user", exist);
            // 3. 如果正确，跳转到后台管理系统的首页
            req.getRequestDispatcher("console.jsp").forward(req, resp);
        } else {
            // 4. 如果不正确，跳转到登录页面，并提示错误信息
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<script>alert('用户名或密码错误');location.href='login.jsp'</script>");
        }
    }
}
