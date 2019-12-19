package com.neusoft.lesson07.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    private int count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("创建");
        System.out.println(++count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("销毁");
        System.out.println(--count);
    }
}
