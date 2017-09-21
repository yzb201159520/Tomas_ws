package com.tomas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tomas.web.dao.UserDao;

/**
 * 主页面的controller
 * @author thomas
 *
 */
@Controller
@RequestMapping(value={"/","/home"})
public class HomeController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		System.out.println(userDao);
		System.out.println(userDao.showUsers());
		return "home";
	}
}
