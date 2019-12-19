package com.zgl.service;

import java.util.List;

import com.zgl.DAO.UserDAOImpl;
import com.zgl.common.BaseDAO;
import com.zgl.entity.UserEntity;

public class UserService {

	private BaseDAO<UserEntity> dao = new UserDAOImpl();
	
	public List<UserEntity> getUsers()
	{
		String sql = "select * from t_student";
		return dao.execute_Query(sql, null);
	}
}
