package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/show.do"},loadOnStartup = 0)
public class TestServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("servlet进行初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);

        System.out.println("servlet进行服务方法");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ///super.doGet(req, resp);
        System.out.println("servlet进行doGet");
        String uname = "";
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ///super.doPost(req, resp);
        System.out.println("servlet进行doPost");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("servlet进行销毁");
    }
}
