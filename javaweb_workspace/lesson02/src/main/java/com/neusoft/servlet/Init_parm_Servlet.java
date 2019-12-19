package com.neusoft.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "parm_servlet", urlPatterns = {"/init.do"}
,initParams = {
            @WebInitParam(name="driver",value="mysql")
            ,@WebInitParam(name="url",value="sdfsdfsdf")
            ,@WebInitParam(name = "user",value = "root")})
public class Init_parm_Servlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        String driver = config.getInitParameter("driver");
        String url = config.getInitParameter("url");
        String user = config.getInitParameter("user");

        System.out.println(driver);
        //super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
