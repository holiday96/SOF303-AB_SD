package com.sof303.service;

import java.util.List;

import com.sof303.model.TrustRegionModel;

public interface ITrustRegionService {

	TrustRegionModel findOne(Integer id);
	List<TrustRegionModel> findByName(String name);
	List<TrustRegionModel> findAll();
	List<TrustRegionModel> findAllInclude();
	List<TrustRegionModel> findByNameInclude(String name);
	TrustRegionModel save(TrustRegionModel model);
	TrustRegionModel update(TrustRegionModel updateTrustRegion);
}
