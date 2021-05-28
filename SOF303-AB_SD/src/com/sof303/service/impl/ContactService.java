package com.sof303.service.impl;

import java.util.List;

import com.sof303.dao.IContactDAO;
import com.sof303.dao.impl.ContactDAO;
import com.sof303.model.ContactModel;
import com.sof303.service.IContactService;

public class ContactService implements IContactService {

    private static IContactDAO iContactDAO = new ContactDAO();
    private static List<ContactModel> lstContactModels = iContactDAO.findAll();

    @Override
    public List<ContactModel> findAll() {
        return lstContactModels;
    }

    @Override
    public String getNameById(int id) {
        for (ContactModel e : lstContactModels) {
            if (e.getId().equals(id)) return e.getFirstName();
        }
        return null;
    }
}
