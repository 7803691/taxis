package com.kdv.taxis.xmlParser;

import com.kdv.taxis.bean.Model;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.IModelService;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.util.List;

public class XmlModelImpl implements IModelService {
    private XStream xStream;
    private File xmlFile;

    public XmlModelImpl() {
        xStream = new XStream();
        xStream.processAnnotations(XmlModelList.class);
        xmlFile = new File(Config.MODEL_XML);
    }

    @Override
    public List<Model> getAllModels (){
        XmlModelList readObject = (XmlModelList) xStream.fromXML(xmlFile);
        List<Model> modelList = readObject.getModels();
        return modelList;
    }

    @Override
    public Model getModelById(Integer id) {
        List<Model> models = getAllModels();
        return models.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Integer getModelCount() {
        Integer count = getAllModels().size();
        return count;
    }




}
