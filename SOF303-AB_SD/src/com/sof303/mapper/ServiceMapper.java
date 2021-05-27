package com.sof303.mapper;

import com.sof303.model.ServiceModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceMapper implements RowMapper<ServiceModel> {
    @Override
    public ServiceModel mapRow(ResultSet rs) {
        try {
            ServiceModel serviceModel = new ServiceModel();
            serviceModel.setId(rs.getInt("SERVICEID"));
            serviceModel.setIdContact(rs.getInt("CONTACTID"));
            return serviceModel;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}
