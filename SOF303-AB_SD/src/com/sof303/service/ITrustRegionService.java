package com.sof303.service;

import java.util.List;

import com.sof303.model.TrustRegionModel;
import com.sof303.sort.Sorter;

public interface ITrustRegionService {

	TrustRegionModel findOne(Integer id);
	List<TrustRegionModel> findByName(String name, Sorter sort);
	List<TrustRegionModel> findAll(Sorter sort);
	TrustRegionModel save(TrustRegionModel model);
	TrustRegionModel update(TrustRegionModel updateTrustRegion);
}
