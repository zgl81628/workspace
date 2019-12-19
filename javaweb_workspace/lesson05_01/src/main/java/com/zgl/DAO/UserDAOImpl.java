package com.zgl.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zgl.common.BaseDAO;
import com.zgl.entity.UserEntity;

public class UserDAOImpl extends BaseDAO<UserEntity>{

	@Override
	public List<UserEntity> resultSetToList(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		List<UserEntity> list = new ArrayList<>();
		while(rs.next())
		{
			UserEntity user = new UserEntity();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setAge(rs.getInt("age"));
			user.setSex(rs.getString("sex"));
			list.add(user);
		}
		return list;
	}

}
