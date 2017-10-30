package com.tomas.test.projecttest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.tomas.web.controller.HomeController;
import com.tomas.web.instance.Spittle;

public class HomeControllerTest {
	
	/**
	 * 简单的测试 HomeController的第一个访问方法
	 * @throws Exception
	 */
	@Test
	public void testHome() throws Exception{
		HomeController homeController =new HomeController();
		// 创建模拟
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));
		
		System.out.println("测试通过");
	}
	
}
