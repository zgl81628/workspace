package com.neusoft.lesson07.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("request销毁");

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("request创建");
    }
}
