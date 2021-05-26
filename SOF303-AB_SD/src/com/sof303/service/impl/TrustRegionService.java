package com.sof303.service.impl;

import java.util.List;

import com.sof303.dao.ITrustRegionDAO;
import com.sof303.dao.impl.TrustRegionDAO;
import com.sof303.model.TrustRegionModel;
import com.sof303.service.ITrustRegionService;

public class TrustRegionService implements ITrustRegionService{
	
	private ITrustRegionDAO trustRegionDAO = new TrustRegionDAO();

	@Override
	public List<TrustRegionModel> findAll() {
		return trustRegionDAO.findAll();
	}

	@Override
	public List<TrustRegionModel> findByName(String name) {
		if (name.equals("09")) {
			return trustRegionDAO.findByName("[^0-9]");
		}
		return trustRegionDAO.findByName(name);
	}
}
