package com.tomas.web.dao.itrface;

import java.util.List;

import com.tomas.web.instance.Country;

public interface CountryDAO {
	Country getById(int id);
	List<Country> findAll();
	int insert(Country country);
}
