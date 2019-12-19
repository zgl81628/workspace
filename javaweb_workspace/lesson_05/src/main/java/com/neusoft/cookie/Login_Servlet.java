package com.neusoft.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login.do")
public class Login_Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        req.setCharacterEncoding("UTF-8");
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        UserInfo user = BeanTools.requestToBean(req,UserInfo.class);
        System.out.println(user);
        ///TODO 使用用户名和密码去数据库验证


        HttpSession session = req.getSession();
        session.setAttribute("uname",uname);

        req.getRequestDispatcher("index1.jsp").forward(req,resp);

    }
}
