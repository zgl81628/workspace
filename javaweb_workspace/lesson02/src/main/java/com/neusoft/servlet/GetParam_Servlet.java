package com.neusoft.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;


@WebServlet(urlPatterns = {"/getparam.do"},loadOnStartup = 0
        ,initParams = {@WebInitParam(name = "url",value ="mysql")
        ,@WebInitParam(name = "uname",value = "root")})
public class GetParam_Servlet extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        ///super.init(config);
        String url = config.getInitParameter("url");
        String uname = config.getInitParameter("uname");
        System.out.println(url+"------------"+uname);


        Enumeration<String> em = config.getInitParameterNames();
        while(em.hasMoreElements())
        {
            String str = em.nextElement();
            System.out.println(str);
        }

        System.out.println(config.getServletName());

        ServletContext context = config.getServletContext();
        Enumeration<String> em1 = context.getInitParameterNames();
        while(em1.hasMoreElements())
        {
            String str = em1.nextElement();
            System.out.println(str);
        }

        String path = context.getContextPath();
        System.out.println("上下文路径:"+path);
        String sname = context.getServletContextName();
        System.out.println("Web应用的名字:"+sname);
        String realparh = context.getRealPath("js");
        System.out.println("realparh的路口:"+realparh);
        context.setAttribute("gloab","all");
        //InputStream inputStream = context.getResourceAsStream("js");
        //System.out.println("realparh的路口:"+realparh);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);


    }
}
