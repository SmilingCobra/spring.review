package com.xt.spring.context.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.xt.spring.context.jdbc.entity.UserInfo;

public class UserDaoJDBC implements UserDao{

	private JdbcTemplate jdbcTemplate;
	public List<UserInfo> selectAllUserInfo() {
		String sql = "select * from user_info";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public UserInfo selectUserInfoById(String userId) {
		String sql="select * from user_info where user_id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{userId}, new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
	}
	public int insertUserInfo(UserInfo userInfo) {
		String sql = "insert into user_info values(?,?,?)";
		return  jdbcTemplate.update(sql, userInfo.getMoney(),userInfo.getUserId(),userInfo.getUserName());
		
	}
	public int deleteUserInfoByIds(String userId) {
		String sql = "delete from user_info where user_id = ?";
		return jdbcTemplate.update(sql, userId);
	}

}
