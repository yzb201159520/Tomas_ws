package com.tomas.web.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tomas.web.repo.SpittleRepository;

/**
 * 用于测试 在方法内调用了其他方法已经Model内已经存在值的情况
 * @author thomas
 *
 */
@Controller
@RequestMapping(value={"/spittle"})
public class SpittleController {
	
	@Autowired
	private SpittleRepository spittleRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String spittles(Model model){
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittle";
	}

	@RequestMapping(value={"/param"},method=RequestMethod.GET)
	public String spittlesParam(@RequestParam(value="inputId",defaultValue="10000")int showId,Model model){
		System.out.println("showId:  "+showId);
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittle";
	}
	
	@RequestMapping(value={"/param2"},method=RequestMethod.GET)
	public String spittlesParam2(@RequestParam(defaultValue="10000")int showId,Model model){
		System.out.println("showId:  "+showId);
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittle";
	}
	
	@RequestMapping(value={"/pathParam/{ppParam}"},method=RequestMethod.GET)
	public String spittlesPathParam(@PathVariable(value="ppParam")int showId,Model model){
		System.out.println("showId:  "+showId);
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittle";
	}
	
	@RequestMapping(value={"/pathParam2/{showId}"},method=RequestMethod.GET)
	public String spittlesPathParam2(@PathVariable int showId,Model model){
		System.out.println("showId:  "+showId);
		model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittle";
	}
	
	/**
	 * bean注入的必要方式，编译通过
	 * @param spittleController
	 */
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleRepository = spittleRepository;
	}
	
	public SpittleController() {
	}
}
