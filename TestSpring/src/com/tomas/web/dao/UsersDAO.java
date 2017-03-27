package com.tomas.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tomas.web.instance.Users;

public interface UsersDAO {

	List<Users> findAll();
	
	Users findById(Integer id);
	
	/**
	 * 默认情况下 按参数的顺序进行取值 如0，1，2
	 * 如果  想使用  命名参数  则需要用@Param 进行声明
	 * @param username
	 * @param password
	 * @return
	 */
	List<Users> findInfo(String username,@Param("password") String password);
}
