package com.sof303.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sof303.model.CountryModel;

public class CountryMapper implements RowMapper<CountryModel>{

	@Override
	public CountryModel mapRow(ResultSet rs) {
		try {
			CountryModel model = new CountryModel();
			model.setId(rs.getInt("COUNTRYID"));
			model.setName(rs.getString("COUNTRYNAME"));
			return model;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
