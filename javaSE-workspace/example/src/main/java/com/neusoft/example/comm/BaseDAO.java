package com.neusoft.example.comm;

import java.io.Serializable;
import java.sql.*;
import java.util.List;

public abstract class BaseDAO <T extends Serializable> {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/db_meimei?verifyServerCertificate=false&useSSL=false";
    private String user = "root";
    private String password = "1234";
    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    /***
     * 创建数据库连接
     *
     *
     */
    public void getConnection(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接已经创建..........");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public List<T> exec_Query(String sql, Object[] objects, String log){
        getConnection();
        try {
            ps = connection.prepareStatement(sql);
            setParam(ps,objects);
            rs = ps.executeQuery();
            System.out.println(log);
            return resultToList(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
    public int exec_Update(String sql,Object[] objects,String log){
        int flag = -1;
        getConnection();
        try {
            ps = connection.prepareStatement(sql);
            setParam(ps,objects);
            flag = ps.executeUpdate();
            System.out.println(log);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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


    /***
     * 关闭数据库连接
     * @throws SQLException
     */
    public void closeConnection() throws SQLException {
        if (rs != null){
            rs.close();
        }

        if (ps != null)
        {
            ps.close();
        }

        if (connection != null)
        {
            connection.close();
        }
        System.out.println("数据库连接正常关闭..........");
    }
}
