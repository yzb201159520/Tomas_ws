package com.tomas.web.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.tomas.web.instance.UserBaseInfo;

@MapperScan
public interface UserDao {
	
	public UserBaseInfo showUsers(int id);
}
