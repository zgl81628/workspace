package com.neusoft.lesson07.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListenerImpl implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("创建");
        String url =  servletContextEvent.getServletContext().getInitParameter("contextConfigLocation");
        System.out.println(url);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("销毁");
    }
}
