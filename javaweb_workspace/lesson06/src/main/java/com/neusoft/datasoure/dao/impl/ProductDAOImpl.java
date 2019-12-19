package com.neusoft.datasoure.dao.impl;

import com.neusoft.datasoure.comm.BaseDAO;
import com.neusoft.datasoure.dao.IProductDAO;
import com.neusoft.datasoure.entity.Product;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductDAOImpl extends BaseDAO<Product> implements IProductDAO {

    @Override
    protected List<Product> resultToList(ResultSet rs) throws SQLException {
        List<Product> list = new ArrayList<>();
        while(rs.next())
        {
            Product p = new Product();
            p.setPid(rs.getInt("pid"));
            p.setPname(rs.getString("pname"));
            p.setUnit(rs.getString("unit"));
            p.setCount(rs.getInt("count"));
            p.setMark(rs.getString("mark"));
            list.add(p);
        }
        return list;
    }

    @Override
    public List<Product> queryAll() {
        String sql = "select * from t_product";
        return exec_Query(sql,null,"查询所有");
    }

    @Override
    public List<Product> queryProductByNameandUnit(Product product) {
        String sql = "select * from t_product where pname=? and unit=?";
        Object[] objects = {product.getPname(),product.getUnit()};
        return exec_Query(sql,objects,"根据商品名称和单位查询商品列表");
    }

    @Override
    public Product queryOneByID(Integer id) {
        String sql = "select * from t_product where pid=?";
        Object[] objects = {id};
        return exec_Query(sql,objects,"根据商品id查询商品详情")
                .stream().findFirst().orElse(null);
    }

    @Override
    public int add_Product(Product product) {
        String sql = "insert into t_product values(null,?,?,?,?)";
        Object[] objects = {product.getPname(),product.getUnit(),product.getCount(),product.getMark()};
        return exec_Update(sql,objects,"添加商品信息!!!!");
    }

    @Override
    public int del_Product(Integer id) {
        String sql = "delete from t_product where pid=?";
        Object[] objects = {id};
        return exec_Update(sql,objects,"根据ID删除商品信息");
    }

    @Override
    public int modify_Product(Product product) {
        String sql = "update t_product set pname=?,unit=?,count=?,mark=? where pid=?";
        Object[] objects = {product.getPname(),product.getUnit()
                ,product.getCount(),product.getMark()
                ,product.getPid()};
        return exec_Update(sql,objects,"修改商品信息!!!!");
    }
}
