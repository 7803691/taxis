package com.kdv.taxis.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Objects;


@XStreamAlias("brand")
public class Brand {

    private static final Logger log = LogManager.getLogger(Brand.class);
    @XStreamAlias("id")
    private int id;
    @XStreamAlias("name")
    private String name;


    public Brand() {
    }

//    public Brand(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public int getId() {
        log.info("Get brand id");
        return id;

    }

    public String getName() {
        log.info("Get brand name");
        return name;
    }

    public void setId(int id) {
        this.id = id;
        log.info("Set brand id");
    }

    public void setName(String name) {

        this.name = name;
        log.info("Set brand name");
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return id == brand.id &&
                Objects.equals(name, brand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

