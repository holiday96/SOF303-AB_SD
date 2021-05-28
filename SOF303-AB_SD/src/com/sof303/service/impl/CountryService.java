package com.sof303.service.impl;

import java.util.List;

import com.sof303.dao.ICountryDAO;
import com.sof303.dao.impl.CountryDAO;
import com.sof303.model.CountryModel;
import com.sof303.service.ICountryService;

public class CountryService implements ICountryService{

	private ICountryDAO countryDAO = new CountryDAO();
	
	@Override
	public List<CountryModel> findAll() {
		return countryDAO.findAll();
	}

	@Override
	public CountryModel findOne(Integer id) {
		return countryDAO.findOne(id);
	}

}
