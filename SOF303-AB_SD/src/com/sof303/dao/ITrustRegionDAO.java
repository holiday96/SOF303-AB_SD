package com.sof303.dao;

import java.util.List;

import com.sof303.model.TrustRegionModel;

public interface ITrustRegionDAO extends GenericDAO<TrustRegionModel>{

	TrustRegionModel findOne(Integer id);
	List<TrustRegionModel> findAll();
	List<TrustRegionModel> findByName(String name);
	Integer save(TrustRegionModel trustRegionModel);
	void update(TrustRegionModel updateTrustRegion);
}
