package com.sof303.dao;

import com.sof303.model.ContactModel;

import java.util.List;

public interface IContactDAO extends GenericDAO<ContactModel> {
    List<ContactModel> findAll();
}
