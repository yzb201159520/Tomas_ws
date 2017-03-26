package com.tomas.web.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 主页面的controller
 * @author thomas
 *
 */
@Controller
@RequestMapping(value={"/","/home"})
public class HomeController {
	
	@Autowired
	private DataSource dataSource;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		System.out.println(dataSource);
		return "home";
	}
}
