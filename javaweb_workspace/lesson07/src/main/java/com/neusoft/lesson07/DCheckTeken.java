package com.neusoft.lesson07;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "Fdfilter",urlPatterns = {"*.do"})
public class DCheckTeken implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("初始化filter2");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
        String uri = req.getRequestURI();


        if(uri.indexOf("/login.do")!=-1){
            filterChain.doFilter(servletRequest,servletResponse);//放行
            return;
        }

        if(null!=session.getAttribute("user")){
            filterChain.doFilter(servletRequest,servletResponse);//放行
        }else{
            resp.sendRedirect("Login.jsp");//滚蛋3
        }
        System.out.println("过滤器启动过滤");
    }

    @Override
    public void destroy() {

    }
}
