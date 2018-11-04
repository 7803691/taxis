package com.kdv.taxis.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;
@XStreamAlias("model")
public class Model {
    @XStreamAlias("id")
    private int id;
    @XStreamAlias("name")
    private String name;


    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
