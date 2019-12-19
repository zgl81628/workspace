package com.neusoft.datasoure.dao.impl;

import com.neusoft.datasoure.dao.IProductDAO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductDAOImplTest {

    private IProductDAO dao = new ProductDAOImpl();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void queryAll() {

        dao.queryAll().forEach(product -> System.out.println(product.getPname()));
    }

    @Test
    public void queryProductByNameandUnit() {
    }

    @Test
    public void queryOneByID() {
    }

    @Test
    public void add_Product() {
    }

    @Test
    public void del_Product() {
    }

    @Test
    public void modify_Product() {
    }
}