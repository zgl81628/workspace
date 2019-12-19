package com.neusoft.datasoure.dao;

import com.neusoft.datasoure.entity.Product;

import java.util.List;

public interface IProductDAO {

    List<Product> queryAll();

    List<Product> queryProductByNameandUnit(Product product);

    Product queryOneByID(Integer id);

    int add_Product(Product product);

    int del_Product(Integer id);

    int modify_Product(Product product);
}
