package com.neusoft.example.DAO;

import com.neusoft.example.entity.Emp01;

import java.util.List;

public interface EmpDAO {

    public List<Emp01> queryAll();

    public int insertEmp01(Emp01 emp01);

    public int updateEmp01(Emp01 emp01);

    public int deleteEmp01(int id);
}
