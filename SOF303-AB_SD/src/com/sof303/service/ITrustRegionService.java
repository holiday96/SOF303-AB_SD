package com.sof303.service;

import java.util.List;

import com.sof303.model.TrustRegionModel;

public interface ITrustRegionService {

	TrustRegionModel findOne(Integer id);
	List<TrustRegionModel> findByName(String name);
	List<TrustRegionModel> findAll();
	TrustRegionModel save(TrustRegionModel model);
	TrustRegionModel update(TrustRegionModel updateTrustRegion);
}
