package com.neusoft.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test.do")
public class DispatherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ///TODO 请求转发\
        String str = this.getServletContext().getAttribute("gloab").toString();
        System.out.println(str);
        resp.setContentType("text/html;charset=utf-8");
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        req.setAttribute("uname","Tom");
        rd.forward(req,resp);

    }
}
