package com.neusoft.lesson07.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttrListener implements HttpSessionAttributeListener {

    ///向购物车存放商品信息,检查当前用户是否为游客
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        HttpSession session = httpSessionBindingEvent.getSession();
        Object user =  session.getAttribute("user");
        if(null==user){
            System.out.println("游客");
        }else{
            System.out.println("卖家");
        }

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
