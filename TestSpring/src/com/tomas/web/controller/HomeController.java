package com.tomas.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tomas.web.dao.itrface.CountryDAO;
import com.tomas.web.dao.itrface.TeacherDAO;
import com.tomas.web.dao.itrface.UsersDAO;
import com.tomas.web.instance.Address;
import com.tomas.web.instance.Country;
import com.tomas.web.instance.Teacher;

/**
 * 主页面的controller
 * @author thomas
 *
 */
@Controller
@RequestMapping(value={"/","/home"})
public class HomeController {
	
	@Autowired
	private UsersDAO usersDao;
	
	@Autowired
	private CountryDAO countryDAO;
	
	@Autowired
	private TeacherDAO teacherDAO;
	
	@RequestMapping(value="/testTeacher",method=RequestMethod.GET)
	public String testTeacher()
	{
		System.out.println(teacherDAO);
		System.out.println(teacherDAO.queryTeacherById(1));
		return "home";
	}
	
	@RequestMapping(value="/123",method=RequestMethod.GET)
	public String home(){
		System.out.println("123");
		System.out.println(usersDao);
		System.out.println(usersDao.findAll());
		return "home";
	}
	
	@RequestMapping(value="/1233",method=RequestMethod.GET)
	public String home2(){
		System.out.println("123");
		System.out.println(countryDAO);
		System.out.println(countryDAO.findAll());
		Country country = new Country();
		country.setCreateTime(new Date());
		Address addr = new Address();
		addr.setEastdis("123");
		addr.setHigher("dsg");
		addr.setNorthdis("tutyu");
		addr.setTemperature(123);
		country.setLocalAddress(addr);
		country.setLocation("fdshdfh");
		country.setName("sdgdhfgjf");
		country.setTotalPeopleNum(897);
		countryDAO.insert(country);
		return "home";
	}
}
