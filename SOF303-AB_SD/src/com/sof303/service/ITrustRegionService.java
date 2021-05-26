package com.sof303.service;

import java.util.List;

import com.sof303.model.TrustRegionModel;

public interface ITrustRegionService {

	List<TrustRegionModel> findAll();
	List<TrustRegionModel> findByName(String name);
}
