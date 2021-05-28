package com.sof303.dao;

import java.util.List;

import com.sof303.model.TrustRegionModel;
import com.sof303.sort.Sorter;

public interface ITrustRegionDAO extends GenericDAO<TrustRegionModel>{

	TrustRegionModel findOne(Integer id);
	List<TrustRegionModel> findAll(Sorter sort);
	List<TrustRegionModel> findByName(String name, Sorter sort);
	Integer save(TrustRegionModel trustRegionModel);
	void update(TrustRegionModel updateTrustRegion);
}
