package com.kdv.taxis.xmlParser;

import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.bean.Car;
import com.kdv.taxis.xmlParser.XmlCarList;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.ICarService;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class XmlCarImpl implements ICarService {

    private XStream xStream;
    private File xmlFile;

    public XmlCarImpl() {
        xStream = new XStream();
        xStream.processAnnotations(XmlCarList.class);
        xmlFile = new File(Config.CAR_XML);
    }

    @Override
    public List<Car> getAllCars (){
        XmlCarList readObject = (XmlCarList) xStream.fromXML(xmlFile);
        List<Car> carList = readObject.getCars();
        return carList;
    }

    @Override
    public Car getCarById(Integer id) {
        List<Car> cars = getAllCars();
        return cars.stream().filter(c -> c.getId() == (int) id).findFirst().orElse(null);
    }

    @Override
    public Integer getCarCount() {
        Integer count = getAllCars().size();
        return count;
    }

    @Override
    public Double getCostOfTaxis() {
        Double costOfTaxis = getAllCars().stream().mapToDouble(c -> c.getCost()).sum();
        return costOfTaxis;
    }

    @Override
    public List<Car> sortTaxisByFuelCons() {
       List<Car> carList = getAllCars();
       carList.sort(Comparator.comparing(Car::getFuelCons));
       return carList;
    }

    @Override
    public List<Car> getCarByBrand(Integer idBrand) {
        return null;
    }

    @Override
    public List<Car> getCarByLevel(Integer idLevel) {
        return null;
    }


}
