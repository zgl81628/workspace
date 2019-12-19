package com.neusoft.servlet;

import com.neusoft.comm.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product.do/*")
public class ProductServlet extends BaseServlet {

    public void add_product(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        System.out.println("添加商品");
        String age = request.getParameter("age");
        System.out.println(age);
        this.find_product(request,response);
    }

    public void del_product(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        System.out.println("删除商品");
    }

    public void modify_product(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        System.out.println("修改商品");
    }

    public void find_product(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("查询商品");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
