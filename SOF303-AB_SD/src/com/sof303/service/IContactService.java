package com.sof303.service;

import com.sof303.model.ContactModel;

import java.util.List;

public interface IContactService {
    List<ContactModel> findAll();

    String getNameById(int id);
}
