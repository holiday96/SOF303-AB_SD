package com.sof303.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sof303.model.TrustRegionModel;

public class TrustRegionMapper implements RowMapper<TrustRegionModel>{

	@Override
	public TrustRegionModel mapRow(ResultSet rs) {
		try {
			TrustRegionModel model = new TrustRegionModel();
			model.setId(rs.getInt("TRUSTREGIONID"));
			model.setName(rs.getString("NAME"));
			model.setDescription(rs.getString("DESCRIPTION"));
			model.setCountryId(rs.getInt("COUNTRYID"));
			return model;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
