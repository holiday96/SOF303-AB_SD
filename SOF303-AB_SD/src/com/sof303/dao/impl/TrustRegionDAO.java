package com.sof303.dao.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.sof303.dao.ITrustRegionDAO;
import com.sof303.mapper.TrustRegionMapper;
import com.sof303.model.TrustRegionModel;
import com.sof303.sort.Sorter;

public class TrustRegionDAO extends AbstractDAO<TrustRegionModel> implements ITrustRegionDAO {

	@Override
	public List<TrustRegionModel> findAll(Sorter sort) {
		StringBuilder sql = new StringBuilder("SELECT * FROM TRUSTREGION");
		if (sort != null && StringUtils.isNotBlank(sort.getSortName()) && StringUtils.isNotBlank(sort.getSortBy())) {
			sql.append(" ORDER BY " + sort.getSortName() + " " + sort.getSortBy() + "");
		}
		return query(sql.toString(), new TrustRegionMapper());
	}

	@Override
	public List<TrustRegionModel> findByName(String name, Sorter sort) {
		StringBuilder sql = new StringBuilder("SELECT * FROM TRUSTREGION WHERE NAME");
		if (name.equals("0 - 9")) {
			name = "^[0-9]+";
			sql.append(" REGEXP ?");
			if (sort != null && StringUtils.isNotBlank(sort.getSortName()) && StringUtils.isNotBlank(sort.getSortBy())) {
				sql.append(" ORDER BY " + sort.getSortName() + " " + sort.getSortBy() + "");
			}
			return query(sql.toString(), new TrustRegionMapper(), name);
		} else {
			sql.append(" LIKE ?");
			if (sort != null && StringUtils.isNotBlank(sort.getSortName()) && StringUtils.isNotBlank(sort.getSortBy())) {
				sql.append(" ORDER BY " + sort.getSortName() + " " + sort.getSortBy() + "");
			}
		}
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
