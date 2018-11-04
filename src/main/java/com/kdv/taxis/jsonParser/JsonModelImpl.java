package com.kdv.taxis.jsonParser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kdv.taxis.bean.Model;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.IModelService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonModelImpl implements IModelService {
    private Gson gson;
    private BufferedReader br;
    private Type modelListType;

    public JsonModelImpl() throws FileNotFoundException {
        gson = new Gson();
        br = new BufferedReader(new FileReader(Config.MODEL_JSON));
        modelListType= new TypeToken<ArrayList<Model>>() {
        }.getType();

    }

    public List<Model> getAllModels() {
        List<Model> modelList = gson.fromJson(br, modelListType);
        return modelList;
    }

    @Override
    public Model getModelById(Integer id) {
        List<Model> models = getAllModels();
        return models.stream().filter(b -> b.getId() == id).findFirst().orElse(null);

    }

    @Override
    public Integer getModelCount() {
        Integer modelCount = getAllModels().size();
        return modelCount;
    }
   
}
