package com.neusoft.example.example_UI;

import com.neusoft.example.entity.Emp01;
import com.neusoft.example.service.EmpService;

import java.util.List;

public class Emp_UI {

    private EmpService service = new EmpService();

    public void showEmp(){
        List<Emp01> list = service.queryAll();
        list.forEach(emp-> System.out.println(emp));
    }

    public void add_emp(){
        Emp01 emp01 = new Emp01();
        System.out.println("请输入员工编号:");
        emp01.setEmpno(8860);
        emp01.setEname("范秋雯");
        emp01.setJob("班主任");
        emp01.setSal(20000d);
        int a = service.addEmp(emp01);
        String str = a>0?"添加成功":"添加失败";
        System.out.println(str);
    }
}
