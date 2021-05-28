package com.sof303.dao.impl;

import java.util.List;

import com.sof303.dao.ITrustRegionDAO;
import com.sof303.mapper.TrustRegionMapper;
import com.sof303.model.TrustRegionModel;

public class TrustRegionDAO extends AbstractDAO<TrustRegionModel> implements ITrustRegionDAO {

	@Override
	public List<TrustRegionModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM TRUSTREGION");
		return query(sql.toString(), new TrustRegionMapper());
	}

	@Override
	public List<TrustRegionModel> findByName(String name) {
		StringBuilder sql = new StringBuilder("SELECT * FROM TRUSTREGION WHERE NAME");
		if (name.equals("0 - 9")) {
			name = "^[0-9]+";
			sql.append(" REGEXP ?");
			return query(sql.toString(), new TrustRegionMapper(), name);
		}
		sql.append(" LIKE ?");
		return query(sql.toString(), new TrustRegionMapper(), name + "%");
	}

	@Override
	public Integer save(TrustRegionModel trustRegionModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO TRUSTREGION (NAME, DESCRIPTION, COUNTRYID)");
		sql.append(" VALUES(?, ?, ?)");
		return insert(sql.toString(), trustRegionModel.getName(), trustRegionModel.getDescription(),
				trustRegionModel.getCountryId());
	}

	@Override
	public void update(TrustRegionModel updateTrustRegion) {
		StringBuilder sql = new StringBuilder(
				"UPDATE TRUSTREGION SET NAME = ?, DESCRIPTION = ?, COUNTRYID = ? WHERE TRUSTREGIONID = ?");
		update(sql.toString(), updateTrustRegion.getName(), updateTrustRegion.getDescription(),
				updateTrustRegion.getCountryId(), updateTrustRegion.getId());
	}

	@Override
	public TrustRegionModel findOne(Integer id) {
		String sql = "SELECT * FROM TRUSTREGION WHERE TRUSTREGIONID = ?";
		List<TrustRegionModel> trustRegions = query(sql, new TrustRegionMapper(), id);
		return trustRegions.isEmpty() ? null : trustRegions.get(0);
	}
}
