package com.tomas.web.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tomas.web.instance.Spittle;

@Repository
public class SpittleRepository {
	
	@Autowired
	SqlSessionFactoryBean sqlSessionFactory;
	
	public List<Spittle> findSpittles(Long maxValue,int count){
		List<Spittle> spittles = new ArrayList<Spittle>();
		for(int i=0;i<count;i++){
			Spittle spittle = new Spittle("this is message"+i,new Date(System.currentTimeMillis()));
			spittles.add(spittle);
		}
		return spittles;
	}
	
	
}
