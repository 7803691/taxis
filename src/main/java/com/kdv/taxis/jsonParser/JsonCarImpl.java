package com.kdv.taxis.jsonParser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kdv.taxis.bean.Car;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.ICarService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JsonCarImpl  implements ICarService {
    private Gson gson;
    private BufferedReader br;
    private Type carListType;

    public JsonCarImpl() throws FileNotFoundException {
        gson = new Gson();
        br = new BufferedReader(new FileReader(Config.CAR_JSON));
        carListType= new TypeToken<ArrayList<Car>>() {
        }.getType();

    }

    public List<Car> getAllCars() {
        List<Car> carList = gson.fromJson(br, carListType);
        return carList;
    }

    @Override
    public Car getCarById(Integer id) {
        List<Car> cars = getAllCars();
        return cars.stream().filter(b -> b.getId() == id).findFirst().orElse(null);

    }

    @Override
    public Integer getCarCount() {
        Integer carCount = getAllCars().size();
        return carCount;
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
        //List<Car> carsByBrand = getAllCars();
        //return carsByBrand.stream().filter(b -> b.getIdModel() == idBrand).findAny().orElse(null);

       return null;
    }

    @Override
    public List<Car> getCarByLevel(Integer idLevel) {
        return null;
    }


}

