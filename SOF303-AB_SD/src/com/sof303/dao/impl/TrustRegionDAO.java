package com.sof303.dao.impl;

import java.util.List;

import com.sof303.dao.ITrustRegionDAO;
import com.sof303.mapper.TrustRegionMapper;
import com.sof303.model.TrustRegionModel;

public class TrustRegionDAO extends AbstractDAO<TrustRegionModel> implements ITrustRegionDAO{

	@Override
	public List<TrustRegionModel> findAll() {
		String sql = "SELECT * FROM TRUSTREGION";
		return query(sql, new TrustRegionMapper());
	}

	@Override
	public List<TrustRegionModel> findByName(String name) {
		String sql = "SELECT * FROM TRUSTREGION WHERE NAME LIKE ?";
		return query(sql, new TrustRegionMapper(), name + '%');
	}

}
