package com.sof303.dao.impl;

import java.util.List;

import com.sof303.dao.IOrganisationDAO;
import com.sof303.mapper.OrganisationMapper;
import com.sof303.model.OrganisationModel;

public class OrganisationDAO extends AbstractDAO<OrganisationModel> implements IOrganisationDAO  {

	@Override
	public List<OrganisationModel> findAll() {
		String sql = "SELECT * FROM organisation";
		return query(sql, new OrganisationMapper());
	}

}
