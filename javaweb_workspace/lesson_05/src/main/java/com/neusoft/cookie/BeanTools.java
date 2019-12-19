package com.neusoft.cookie;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class BeanTools {

    //// 约定前提： 请求中的参数名称需要和javabean的属性名称保持一致！！！！
    public static <T>T requestToBean(HttpServletRequest request , Class<T> clazz) {
        //创建javaBean对象
        Object obj=null;
        try {
            obj=clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        //得到请求中的每个参数
        Enumeration<String> enu = request.getParameterNames();
        while(enu.hasMoreElements())  {
            //获得参数名
            String name = enu.nextElement();

            //获得参数值
            String value = request.getParameter(name);

            //然后把参数拷贝到javaBean对象中
            try {
                BeanUtils.setProperty(obj, name, value);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }

        return (T)obj;
    }
}
