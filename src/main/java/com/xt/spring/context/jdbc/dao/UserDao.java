package com.xt.spring.context.jdbc.dao;

import java.util.List;

import com.xt.spring.context.jdbc.entity.UserInfo;

public interface UserDao {
public List<UserInfo> selectAllUserInfo();
public UserInfo selectUserInfoById(String userId);
public int insertUserInfo(UserInfo userInfo);
public int deleteUserInfoByIds(String userId);
}
