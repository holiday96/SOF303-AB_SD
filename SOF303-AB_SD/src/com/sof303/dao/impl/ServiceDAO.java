package com.sof303.dao.impl;

import com.sof303.dao.IServiceDAO;
import com.sof303.mapper.ServiceMapper;
import com.sof303.model.ServiceModel;

import java.util.ArrayList;
import java.util.List;

public class ServiceDAO extends AbstractDAO<ServiceModel> implements IServiceDAO {

    @Override
    public List<ServiceModel> findAll() {
        String sql = "SELECT * FROM SERVICE";
        return query(sql, new ServiceMapper());
    }
}
