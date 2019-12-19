package com.neusoft.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/show.do")
public class Cookie_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        //创建cookie
        Cookie cookie = new Cookie("name",URLEncoder.encode("张三","UTF-8"));
        cookie.setDomain("localhost");
        cookie.setMaxAge(60*30);
        cookie.setPath("/");

        //将cookie存储到客户端
        resp.addCookie(cookie);

        //跳转到jsp页面
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
