package com.sof303.dao;

import com.sof303.model.ServiceModel;

import java.util.List;

public interface IServiceDAO extends GenericDAO<ServiceModel> {

    List<ServiceModel> findAll();

}
