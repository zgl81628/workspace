package com.neusoft.lesson07.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class RequestAttrListener implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //servletRequestAttributeEvent.getName()
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }
}
