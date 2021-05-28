package com.sof303.service.impl;

import com.sof303.dao.IServiceDAO;
import com.sof303.dao.impl.ServiceDAO;
import com.sof303.model.ServiceModel;
import com.sof303.service.IServiceService;

import java.util.List;

public class ServiceService implements IServiceService {

    private static IServiceDAO iServiceDAO = new ServiceDAO();
    private static List<ServiceModel> lstServiceModels = iServiceDAO.findAll();

    @Override
    public List<ServiceModel> findAll() {
        return lstServiceModels;
    }
}
