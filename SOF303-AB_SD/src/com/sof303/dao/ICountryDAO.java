package com.sof303.dao;

import java.util.List;

import com.sof303.model.CountryModel;

public interface ICountryDAO extends GenericDAO<CountryModel>{

	List<CountryModel> findAll();
	CountryModel findOne(Integer id);
}
