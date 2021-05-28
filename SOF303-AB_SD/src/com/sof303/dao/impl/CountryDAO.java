package com.sof303.dao.impl;

import java.util.List;

import com.sof303.dao.ICountryDAO;
import com.sof303.mapper.CountryMapper;
import com.sof303.model.CountryModel;

public class CountryDAO extends AbstractDAO<CountryModel> implements ICountryDAO{

	@Override
	public List<CountryModel> findAll() {
		String sql = "SELECT * FROM COUNTRY";
		return query(sql, new CountryMapper());
	}

	@Override
	public CountryModel findOne(Integer id) {
		String sql = "SELECT * FROM COUNTRY WHERE COUNTRYID = ?";
		List<CountryModel> countrys = query(sql, new CountryMapper(), id);
		return countrys.isEmpty() ? null : countrys.get(0);
	}
}
