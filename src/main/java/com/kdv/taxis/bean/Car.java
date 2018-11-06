package com.kdv.taxis.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import java.util.List;
@XStreamAlias("car")
public class Car {
    private static final Logger log = LogManager.getLogger(Brand.class);
    @XStreamAlias("id")
    private Integer id;

    @XStreamAlias("year")
    private Integer year;

    @XStreamAlias("review")
    private Integer review;

    @XStreamAlias("regNumber")
    private String regNumber;

    @XStreamAlias("idModel")
    private Integer idModel;

    @XStreamAlias("idLevel")
    private Integer idLevel;

    @XStreamAlias("idBrand")
    private Integer idBrand;

    @XStreamAlias("cost")
    private double cost;

    @XStreamAlias("fuelCons")
    private double fuelCons;

    @Override
    public String toString() {
      //  log.debug("toString Method");
        return "Car{" +
                "id=" + id +
                ", year=" + year +
                ", review=" + review +
                ", regNumber='" + regNumber + '\'' +
                ", idModel=" + idModel +
                ", idLevel=" + idLevel +
                ", idBrand=" + idBrand +
                ", cost=" + cost +
                ", fuelCons=" + fuelCons +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getReview() {
        return review;
    }

    public void setReview(Integer review) {
        this.review = review;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Integer getIdModel() {
        return idModel;
    }

    public void setIdModel(Integer idModel) {
        this.idModel = idModel;
    }

    public Integer getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(Integer idLevel) {
        this.idLevel = idLevel;
    }

    public Integer getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Integer idBrand) {
        this.idBrand = idBrand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(double fuelCons) {
        this.fuelCons = fuelCons;
    }
}
