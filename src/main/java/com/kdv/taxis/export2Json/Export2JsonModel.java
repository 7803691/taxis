package com.kdv.taxis.export2Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kdv.taxis.bean.Model;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.ModelServiceImpl;
import com.kdv.taxis.service.IModelService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;

public class Export2JsonModel {

    private IModelService modelService;
    private Gson gsonBuilder;
    private FileWriter file;

    public Export2JsonModel() throws IOException {
        modelService = new ModelServiceImpl();
        gsonBuilder = new GsonBuilder().create();
        file = new FileWriter(Config.EXPORT_MODEL_JSON);
    }

    public void exportModel() {
        try {
            List<Model> modelList = modelService.getAllModels();
            write2File(file, gsonBuilder.toJson(modelList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
