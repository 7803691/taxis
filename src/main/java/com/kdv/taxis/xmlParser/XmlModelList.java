package com.kdv.taxis.xmlParser;

import com.kdv.taxis.bean.Model;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;
@XStreamAlias("list")
public class XmlModelList {
    @XStreamImplicit(itemFieldName = "model")
    private List<Model> models;


    @Override
    public String toString() {
        return String.valueOf(models);
    }

    public List<Model> getModels() {
        return models;
    }
}
