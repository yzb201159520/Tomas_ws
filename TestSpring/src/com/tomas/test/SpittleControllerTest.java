package com.tomas.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockRequestDispatcher;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import com.tomas.web.controller.SpittleController;
import com.tomas.web.dao.SpittleRepository;
import com.tomas.web.instance.Spittle;

public class SpittleControllerTest {
	
	@Test
	public void testSpittle() throws Exception{
		List<Spittle> expectSpittles = createSpittle(20);
		SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
		Mockito.when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectSpittles);
		
		SpittleController spittleController = new SpittleController(mockRepository);
		
		MockMvc mvc = MockMvcBuilders.standaloneSetup(spittleController)
				.setSingleView(new InternalResourceView("/WEB-INF/views/spittle.jsp")).build();
		
		mvc.perform(MockMvcRequestBuilders.get("/spittle"))
			.andExpect(MockMvcResultMatchers.view().name("spittle"))
			.andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
			.andExpect(MockMvcResultMatchers.model().attribute("spittleList",CoreMatchers.hasItem(expectSpittles.toArray())));
		System.out.println("测试通过");
	}
	
	

	private List<Spittle> createSpittle(int maxNum){
		List<Spittle> spittles = new ArrayList<Spittle>();
		for(int i=0;i<maxNum;i++){
			Spittle spittle = new Spittle("this is message"+i,new Date(System.currentTimeMillis()));
			spittles.add(spittle);
		}
		return spittles;
	}
}
