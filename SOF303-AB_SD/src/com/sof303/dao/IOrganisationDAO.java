package com.sof303.dao;

import java.util.List;
import com.sof303.model.OrganisationModel;

public interface IOrganisationDAO extends GenericDAO<OrganisationModel> {
	List<OrganisationModel> findAll();
}
