package com.kdv.taxis.xmlParser;

import com.kdv.taxis.bean.Car;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;


@XStreamAlias("list")
public class XmlCarList {
    @XStreamImplicit(itemFieldName = "car")
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return String.valueOf(cars);
    }
}
