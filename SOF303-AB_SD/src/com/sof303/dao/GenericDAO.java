package com.sof303.dao;

import java.util.List;

import com.sof303.mapper.RowMapper;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	void update (String sql, Object... parameters);
	Integer insert (String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
