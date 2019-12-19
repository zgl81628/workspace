package com.neusoft.comm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String methodName = req.getParameter("method");

        if(null==methodName) {
            String uri = req.getRequestURI();
            methodName = uri.substring(uri.lastIndexOf("/")+1, uri.length());
            System.out.println(methodName);
        }
        Class<? extends BaseServlet> clazz = this.getClass();//这里的this指的是继承BaseServlet对象
        try {
            // 通过类的字节码对象获取方法的字节码对象
            Method method = clazz.getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            // 方法执行
            method.invoke(this,req,resp);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
