package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/getdata.do")
public class GetDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ///super.doGet(req, resp);

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        System.out.println(name+"____________"+age);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);

        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("userName");
        String password = req.getParameter("password");
        String[] types = req.getParameterValues("type");
        System.out.println(name+"____________"+password);
        //System.out.println(types);
        Arrays.asList(types).forEach(k-> System.out.println(k));
    }
}
