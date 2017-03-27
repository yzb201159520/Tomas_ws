package com.tomas.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tomas.web.dao.UsersDAO;
import com.tomas.web.instance.Users;

/**
 * 主页面的controller
 * @author thomas
 *
 */
@Controller
@RequestMapping(value={"/","/home"})
public class HomeController {
	
	@Autowired
	private UsersDAO usersDAO;
	
	@RequestMapping(value="/topath/{param}",method=RequestMethod.GET)
	public String home(@PathVariable int param,Model model){
		System.out.println("HomeController.home()");
		List<Users> users = usersDAO.findAll(); 
		model.addAttribute("users", users);
		return "home";
	}
}
