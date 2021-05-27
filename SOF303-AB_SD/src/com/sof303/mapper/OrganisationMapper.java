package com.sof303.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.sof303.model.OrganisationModel;

public class OrganisationMapper implements RowMapper<OrganisationModel>{

	@Override
	public OrganisationModel mapRow(ResultSet rs) {
		try {
			OrganisationModel organisation = new OrganisationModel();
			organisation.setId(rs.getInt("orgid"));
			organisation.setName(rs.getString("orgname"));
			organisation.setContact(Integer.valueOf(rs.getString("contactid")));
			return organisation;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
