package com.neusoft.example.DAO.impl;

import com.neusoft.example.DAO.EmpDAO;
import com.neusoft.example.entity.Emp01;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmpDAOImplTest {

    EmpDAO dao = null;

    @Before
    public void stup(){
        dao = new EmpDAOImpl();
    }

    @Test
    public void queryAll() {
      List<Emp01> list = dao.queryAll();
      list.forEach(emp01 -> System.out.println(emp01));
    }

    @Test
    public void insertEmp01() {
        Emp01 emp01 = new Emp01();
        emp01.setEmpno(5648);
        emp01.setEname("修春勇");
        emp01.setJob("技术总监");
        emp01.setSal(20000d);
        dao.insertEmp01(emp01);
    }

    @Test
    public void updateEmp01() {
        Emp01 emp01 = new Emp01();
        emp01.setEmpno(5648);
        emp01.setEname("修春勇");
        emp01.setJob("java项目经理");
        emp01.setSal(20000d);
        dao.updateEmp01(emp01);
    }

    @Test
    public void deleteEmp01() {
     dao.deleteEmp01(8860);
    }
}