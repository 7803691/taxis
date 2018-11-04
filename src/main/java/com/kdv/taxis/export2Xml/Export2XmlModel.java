package com.kdv.taxis.export2Xml;

import com.kdv.taxis.bean.Model;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.ModelServiceImpl;
import com.kdv.taxis.service.IModelService;
import com.thoughtworks.xstream.XStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;

public class Export2XmlModel {
    private IModelService modelService;
    private XStream xStream;
    private FileWriter file;

    public Export2XmlModel() throws IOException {
        modelService = new ModelServiceImpl();
        xStream = new XStream();
        xStream.processAnnotations(Model.class);
        file = new FileWriter(Config.EXPORT_MODEL_XML);


    }

    public void getAllModel(){
        try {
            List<Model> modelList = modelService.getAllModels();
            write2File(file, xStream.toXML(modelList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
