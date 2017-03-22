package com.tomas.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 主页面的controller
 * @author thomas
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(){
		return "home";
	}
}
