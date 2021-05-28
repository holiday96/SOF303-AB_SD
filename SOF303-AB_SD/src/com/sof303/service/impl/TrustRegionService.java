package com.sof303.service.impl;

import java.util.List;

import com.sof303.dao.ITrustRegionDAO;
import com.sof303.dao.impl.TrustRegionDAO;
import com.sof303.model.TrustRegionModel;
import com.sof303.service.ITrustRegionService;

public class TrustRegionService implements ITrustRegionService {

	private ITrustRegionDAO trustRegionDAO = new TrustRegionDAO();

	@Override
	public List<TrustRegionModel> findByName(String name) {
		return trustRegionDAO.findByName(name);
	}

	@Override
	public List<TrustRegionModel> findAll() {
		return trustRegionDAO.findAll();
	}

	@Override
	public List<TrustRegionModel> findAllInclude() {
		return trustRegionDAO.findAllInclude();
	}

	@Override
	public List<TrustRegionModel> findByNameInclude(String name) {
		return trustRegionDAO.findByNameInclude(name);
	}

	@Override
	public TrustRegionModel save(TrustRegionModel model) {
		Integer trustRegionId = trustRegionDAO.save(model);
		return trustRegionDAO.findOne(trustRegionId);
	}

	@Override
	public TrustRegionModel update(TrustRegionModel updateTrustRegion) {
		trustRegionDAO.update(updateTrustRegion);
		return trustRegionDAO.findOne(updateTrustRegion.getId());
	}

	@Override
	public TrustRegionModel findOne(Integer id) {
		return trustRegionDAO.findOne(id);
	}
}
