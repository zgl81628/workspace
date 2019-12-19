package com.neusoft.example.service;

import com.neusoft.example.DAO.EmpDAO;
import com.neusoft.example.DAO.impl.EmpDAOImpl;
import com.neusoft.example.entity.Emp01;
import java.util.List;

public class EmpService {

    private EmpDAO dao = new EmpDAOImpl();


    public List<Emp01> queryAll(){
        return dao.queryAll();
    }

    public int addEmp(Emp01 emp01){
        return dao.insertEmp01(emp01);
    }
}
