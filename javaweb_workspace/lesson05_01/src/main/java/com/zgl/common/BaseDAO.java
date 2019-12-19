package com.zgl.common;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


/***
 * DAO 就是普通dao父类
 * 封装数据操作
 * @author Administrator
 * 分析： DAO 主要作用：增、删、该、查
 * 可以分为2种情况
 * 查询返回结果 reaultSet
 * 增加、删除、修改返回结果 sql影响的行数 int
 */
public abstract class BaseDAO<T extends Serializable> {

	private final String url= "jdbc:mysql://127.0.0.1:3306/db_demo";
	private final String user = "root";
	private final String password = "123456";
	private final String driver = "com.mysql.jdbc.Driver";
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;


	public List<T> execute_Query(String sql,Object[] objects)
	{
		try {
			if(!get_Connection())
			{
				ps = conn.prepareStatement(sql);
				setParams(ps,objects);
				rs = ps.executeQuery();
				return resultSetToList(rs);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				closeCon();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	//结果集转换list 模板
	public abstract List<T> resultSetToList(ResultSet rs) throws SQLException;

	/***
	 * 增加、删除、修改
	 * 参数： sql语句，sql参数
	 * 	//获得连接
	 * @return
	 */
	public int execute_Update(String sql,Object[] objects)
	{
		int flag = -1;
		try {
			if(!get_Connection())
			{
				ps = conn.prepareStatement(sql);
				setParams(ps,objects);
				flag = ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				closeCon();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return flag;
	}

	/**
	 * 连接公共方法
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public boolean get_Connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		return conn.isClosed();
	}

	/**
	 * 设置PreparedStatement参数公共方法
	 * @param ps
	 * @param objects
	 * @throws SQLException
	 */
	public void setParams(PreparedStatement ps,Object[] objects)
			throws SQLException
	{
		if(objects!=null)
		{
			for (int i = 0; i < objects.length; i++) {
				ps.setObject(i+1, objects[i]);
			}
		}
	}

	/***
	 * 关闭连接公共方法
	 * @throws SQLException
	 */
	public void closeCon() throws SQLException
	{
		if(rs!=null)
			rs.close();
		if(ps!=null)
			ps.close();
		if(conn!=null)
			conn.close();
	}
}
