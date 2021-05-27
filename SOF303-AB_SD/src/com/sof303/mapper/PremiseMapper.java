package com.sof303.mapper;

import com.sof303.model.PremiseModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PremiseMapper implements RowMapper<PremiseModel> {
    @Override
    public PremiseModel mapRow(ResultSet rs) {
        try {
            PremiseModel premiseModel = new PremiseModel();
            premiseModel.setId(rs.getInt("PREMISEID"));
            premiseModel.setIdService(rs.getInt("SERVICEID"));
            return premiseModel;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}
