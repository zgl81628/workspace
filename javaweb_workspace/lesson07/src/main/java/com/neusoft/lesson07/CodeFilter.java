package com.neusoft.lesson07;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "CodeFilter",urlPatterns = {"*.do"}
,initParams = {@WebInitParam(name = "encode",value = "UTF-8")}
,servletNames = {""}
,dispatcherTypes = {DispatcherType.REQUEST})
public class CodeFilter implements Filter {

    private String encode = "";
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encode = filterConfig.getInitParameter("encode");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         System.out.println("初始化filter1");
         HttpServletRequest req = (HttpServletRequest) servletRequest;
         HttpServletResponse resp = (HttpServletResponse) servletResponse;

         req.setCharacterEncoding(encode);
         resp.setContentType("text/html;charset="+encode);

         //如果过滤器后面没没有匹配的过滤器,就跳转到目标资源,也就是servlet或者jsp
         filterChain.doFilter(servletRequest,servletResponse);

         System.out.println("过滤器执行完毕!!!!");
    }

    @Override
    public void destroy() {
        System.out.println("销毁filter");
    }
}
