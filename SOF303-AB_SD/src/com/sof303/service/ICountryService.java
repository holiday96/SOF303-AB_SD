package com.sof303.service;

import java.util.List;

import com.sof303.model.CountryModel;

public interface ICountryService {

	List<CountryModel> findAll();
	CountryModel findOne(Integer id);
}
