package com.neusoft.example.DAO.impl;

import com.neusoft.example.DAO.EmpDAO;
import com.neusoft.example.comm.BaseDAO;
import com.neusoft.example.entity.Emp01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOImpl extends BaseDAO<Emp01> implements EmpDAO {

    public List<Emp01> queryAll() {
        String sql = "select * from emp01";
        return this.exec_Query(sql,null,"查询员工表信息!!!!");
    }

    public int insertEmp01(Emp01 emp01) {
        String sql = "insert into emp01 values(?,?,?,?)";
        Object[] objects = {
                emp01.getEmpno()
                ,emp01.getEname()
                ,emp01.getJob()
                ,emp01.getSal()
        };
        return this.exec_Update(sql,objects,"添加员工表信息!!!!");
    }

    public int updateEmp01(Emp01 emp01) {
        String sql = "update emp01 set ename=?,job=?,sal=? where empno=?";
        Object[] objects = {
                emp01.getEname()
                ,emp01.getJob()
                ,emp01.getSal()
                ,emp01.getEmpno()
        };
        return this.exec_Update(sql,objects,"修改员工信息!!!!");
    }

    public int deleteEmp01(int id) {
        String sql = "delete from emp01 where empno=?";
        return this.exec_Update(sql,new Object[]{id},"删除ID是"+id+"员工信息!!!!");
    }

    @Override
    protected List<Emp01> resultToList(ResultSet rs) throws SQLException {
        List<Emp01> list = new ArrayList<>();
        while(rs.next())
        {
            Emp01 emp = new Emp01();
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setSal(rs.getDouble("sal"));
            list.add(emp);
        }
        return list;
    }
}
