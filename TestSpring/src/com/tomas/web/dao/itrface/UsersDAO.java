package com.tomas.web.dao.itrface;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tomas.web.instance.Users;
/*
 * 采用动态代理的设计思想 面向接口编程
 * 设计出 接口UsersDAO 和其对应的 Mapping文件(在文件的namespace属性 为 UsersDAO的文件目录)
 * 在 接口和Mapping文件中添加 相对于的方法,Spring的配置文件进行关联
 * 在程序执行的时候 会根据 配置文件 动态的生成UserDAO接口的代理类 并调用相关的方法(动态代理,已经添加的@Respostory注解)
 */
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
