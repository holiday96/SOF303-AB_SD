package com.sof303.mapper;

import com.sof303.model.ContactModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<ContactModel> {

    @Override
    public ContactModel mapRow(ResultSet rs) {
        ContactModel contactModel= new ContactModel();
        try {
            contactModel.setId(rs.getInt("CONTACTID"));
            contactModel.setFirstName(rs.getString("FIRSTNAME"));
            contactModel.setIdManager(rs.getInt("MANAGERID"));
            return contactModel;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return  null;
        }
    }
}
