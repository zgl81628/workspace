package com.neusoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

@WebServlet(name = "show",urlPatterns = {"/show_ip.do","/index.do"},loadOnStartup = 1)
public class Show_Servlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //IP地址
        String ip = req.getRemoteAddr();

         //端口号
        int port = req.getRemotePort();

        //URL
        String url = req.getRequestURL().toString();

        resp.setContentType("text/html;charset=utf-8");
        //resp.setCharacterEncoding("UTF-8");
        //resp.setLocale(new Locale("zh","CN"));
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"zh\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>");
        out.print("ip地址是:"+ip+"<br/>");
        out.print("ip端口是:"+port+"<br/>");
        out.print("URL是:"+url+"<br/>");
        out.print("</body>\n" +
                "</html>");
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }
}
