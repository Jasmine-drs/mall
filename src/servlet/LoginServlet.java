package servlet;

import bean.User;
import dao.impl.UserDaoImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jasmine-drs
 * @date 2023/5/14 10:21
 */

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf8");
        // 1. 获取请求参数
        String user_id = req.getParameter("user_id");
        String password = req.getParameter("password");

        UserDaoImpl userDao = new UserDaoImpl();
        User exist = userDao.isExist(user_id, password);
        System.out.println("exist = " + exist);

        // 2. 验证用户名和密码是否正确
        if (exist.getId() != null) {
//            session域对象保存用户信息
            req.getSession().setAttribute("user", exist);
            if (exist.getIdentity() == 1) {
                // 3.1 如果正确，重定向到后台管理系统的首页
                resp.sendRedirect("admin/console.jsp");
//                req.getRequestDispatcher("admin/console.jsp").forward(req, resp);
            } else {
                // 3.2 如果正确，重定向到首页
                resp.sendRedirect("index.jsp");
//                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        } else {
            // 4. 如果不正确，跳转到登录页面，并提示错误信息
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("<script>alert('用户名或密码错误');location.href='login.jsp'</script>");
        }
    }
}
