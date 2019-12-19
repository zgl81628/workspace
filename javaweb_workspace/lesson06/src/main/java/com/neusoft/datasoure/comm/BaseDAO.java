package com.neusoft.datasoure.comm;

import java.io.Serializable;
import java.sql.*;
import java.util.List;

public abstract class BaseDAO <T extends Serializable> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;


    public List<T> exec_Query(String sql, Object[] objects, String log)  {
        try {
            connection = DBUitls.getConnection();
            ps = connection.prepareStatement(sql);
            setParam(ps,objects);
            rs = ps.executeQuery();
            System.out.println(log);
            return resultToList(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUitls.close(connection,ps,rs);
        }

        return null;
    }

    protected abstract  List<T> resultToList(ResultSet rs) throws SQLException;

    /***
     * 执行对数据库表的更新操作
     * @param sql
     * @param objects
     * @param log
     * @return
     */
    public int exec_Update(String sql,Object[] objects,String log)  {
        int flag = -1;
        try {
            connection = DBUitls.getConnection();
            ps = connection.prepareStatement(sql);
            setParam(ps,objects);
            flag = ps.executeUpdate();
            System.out.println(log);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUitls.close(connection,ps,rs);
        }
        return flag;
    }

    /***
     * 设置sql语句中的参数
     * @param ps
     * @param objects
     * @throws SQLException
     */
    public void setParam(PreparedStatement ps,Object ...objects) throws SQLException {
        if(objects != null)
        {
            for (int i = 0; i <objects.length ; i++) {
                ps.setObject(i+1,objects[i]);
            }
        }
    }



    /**
     * 判断查询结果集中是否存在某列
     * @param rs 查询结果集
     * @param columnName 列名
     * @return true 存在; false 不存咋
     */
    public boolean isExistColumn(ResultSet rs, String columnName) {
        try {
            if (rs.findColumn(columnName) > 0 ) {
                return true;
            }
        }
        catch (SQLException e) {
            return false;
        }

        return false;
    }
}
