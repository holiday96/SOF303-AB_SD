package com.sof303.dao;

import java.util.List;

import com.sof303.model.TrustRegionModel;

public interface ITrustRegionDAO extends GenericDAO<TrustRegionModel>{

	List<TrustRegionModel> findAll();
	List<TrustRegionModel> findByName(String name);
}
