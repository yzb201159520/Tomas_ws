package com.tomas.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tomas.web.instance.Users;
import com.tomas.web.utils.ApplicationContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
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
		Date date1 = new Date();
		System.out.println(teacherDAO.queryTeacherById(1));
		Date date2 = new Date();
		System.out.println("第一次查询耗时:"+(date2.getTime()-date1.getTime()));
		System.out.println(teacherDAO.queryTeacherById(1));
		Date date3 = new Date();
		System.out.println("第二次查询耗时:"+(date3.getTime()-date2.getTime()));
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

	@RequestMapping(value="/12333",method=RequestMethod.GET)
	public String home3(){
		System.out.println("123");
		Date date1 = new Date();
		System.out.println(countryDAO.getById(1));
		Date date2 = new Date();
		System.out.println("第一次查询耗时:"+(date2.getTime()-date1.getTime()));
		System.out.println(countryDAO.getById(2));
		System.out.println("查询了依次id=2,再次查询id=1;");
		Date date21 = new Date();
		System.out.println(countryDAO.getById(1));
		Date date3 = new Date();
		System.out.println("第二次查询耗时:"+(date3.getTime()-date21.getTime()));
		return "home";
	}

	@RequestMapping(value="/1234",method=RequestMethod.GET)
	public String home4()
	{
		System.out.println("123");
		Date date1 = new Date();
		System.out.println(usersDao);
		for(int i=0;i<100;i++)
		{
			List<Users> userses = new ArrayList<>();
			for(int j=0;j<1000;j++)
			{
				Users users = new Users();
				users.setEmail("email"+i+j+"toberemember");
				users.setPassword("password" + i + j + "word");
				users.setUsername("username" + i + j + "name");
				userses.add(users);
			}
			usersDao.insertAll(userses);
		}
		return "home";
	}

	@RequestMapping(value = "/appCtxt",method = RequestMethod.GET)
	public String queryAppContext()
	{
		HomeController controller = (HomeController)ApplicationContextHolder.getBean("homeController");
		System.out.println(controller);
		System.out.println(ApplicationContextHolder.getBean(UsersDAO.class));
		return "home";
	}

	@RequestMapping(value = "/testscope",method = RequestMethod.GET)
	public String testScope()
	{
		ApplicationContextHolder.getBean("testScopeBean");
		ApplicationContextHolder.getBean("testScopeBean");
		ApplicationContextHolder.getBean("testScopeBean");
		ApplicationContextHolder.getBean("testScopeBean");
		return "home";
	}
}
