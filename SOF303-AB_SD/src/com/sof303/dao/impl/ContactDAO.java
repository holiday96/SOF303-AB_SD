package com.sof303.dao.impl;

import com.sof303.dao.IContactDAO;
import com.sof303.mapper.ContactMapper;
import com.sof303.model.ContactModel;

import java.util.List;

public class ContactDAO extends AbstractDAO<ContactModel> implements IContactDAO {
    @Override
    public List<ContactModel> findAll() {
        String sql = "SELECT * FROM CONTACT";
        return query(sql, new ContactMapper());
    }
}
