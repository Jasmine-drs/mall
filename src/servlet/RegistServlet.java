package servlet;


import bean.User;
import dao.impl.UserDaoImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "RegistServlet", urlPatterns = "/regist")
public class RegistServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        req.setCharacterEncoding("utf8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String second_pwd = req.getParameter("second_pwd");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");


    }
}
