package com.neusoft.cookie;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet(urlPatterns = {"/day.do"},initParams = {@WebInitParam(name = "cc",value = "1")})
public class Cookie_test extends HttpServlet {

    private ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        //super.init(config);
        this.config = config;
        config.getServletContext().setAttribute("ss","1");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       if(req.getServletContext().getAttribute("ss").equals("1")) {
           Cookie cookie1 = new Cookie("count", new Integer(1).toString());
           cookie1.setMaxAge(60 * 60);
           cookie1.setDomain("localhost");
           resp.addCookie(cookie1);
           req.getServletContext().setAttribute("ss","2");
           System.out.println("这是我的第一次!!!!");
       }


        Cookie[] cookies = req.getCookies();
        for (Cookie c: cookies) {
            if(c.getName().equals("count"))
            {
                Integer integer = (Integer.parseInt(c.getValue())+1);
                Cookie cookie2 = new Cookie("count",integer.toString());
                cookie2.setMaxAge(60*60);
                cookie2.setDomain("localhost");
                resp.addCookie(cookie2);
            }
        }


        Cookie cookie = new Cookie("today",LocalTime.now().toString());
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
        req.getRequestDispatcher("test.jsp").forward(req,resp);
    }
}
