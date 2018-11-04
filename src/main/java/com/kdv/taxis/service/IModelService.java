package com.kdv.taxis.service;

import com.kdv.taxis.bean.Model;

import java.util.List;

public interface IModelService {
    List<Model> getAllModels();

    Model getModelById(Integer id);

    Integer getModelCount();

}
