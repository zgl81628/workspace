package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/testreq.do")
public class TestRequest_Servlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ///super.doGet(req, resp);

        String mothod =  req.getMethod();
        System.out.println(mothod);

        String url = req.getRequestURL().toString();
        System.out.println(url);

        String qs = req.getQueryString();
        System.out.println(qs);

        Enumeration<String> em = req.getHeaderNames();
        while (em.hasMoreElements())
        {
            String key = em.nextElement();
            System.out.println("key"+key+"----value"+req.getHeader(key));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }
}
