package com.kdv.taxis.jsonParser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kdv.taxis.bean.Car;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.ICarService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JsonCarImpl  implements ICarService {
    private static final Logger log = LogManager.getLogger(JsonCarImpl.class);
    private Gson gson;
    private BufferedReader br;
    private Type carListType;

    public JsonCarImpl()  {
        try {
            log.debug("CREATE BufferedReader");
            gson = new Gson();
            br = new BufferedReader(new FileReader(Config.CAR_JSON));
            carListType= new TypeToken<ArrayList<Car>>() {
            }.getType();
        } catch (FileNotFoundException e) {
            log.error("IMPORT FILE "+Config.CAR_JSON+" NOT FOUND", e);
            e.printStackTrace();
        }


    }

    public List<Car> getAllCars() {
        List<Car> carList = null;
        try {
            carList = gson.fromJson(br, carListType);
            log.debug("GET ALL CARS FROM " + Config.CAR_JSON);
        }catch (Exception e)
        { e.printStackTrace();
            log.error("ERROR WHILE GETTING ALL CARS FROM "+Config.CAR_JSON, e);
        }
        return carList;
    }

    @Override
    public Car getCarById(Integer id) {
        List<Car> cars =null;
        try {
            cars = getAllCars();
            log.debug("GET CAR BY ID = " + id + " FROM " + Config.CAR_JSON);
        }catch (Exception e){
            e.printStackTrace();
            log.error("ERROR WHILE GETTING CAR BY ID",e);
        }
        return cars.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Integer getCarCount() {
        Integer carCount = getAllCars().size();
        log.debug("GET COUNT OF CARS FROM "+ Config.CAR_JSON);
        return carCount;
    }

    @Override
    public Double getCostOfTaxis() {
        Double costOfTaxis = null;
        try {
            costOfTaxis = getAllCars().stream().mapToDouble(c -> c.getCost()).sum();
            log.debug("GET COST OF TAXIS FROM "+Config.CAR_JSON);
        }catch (Exception e){
            e.printStackTrace();
            log.error("ERROR WHILE GET COST OF TAXIS");
        }
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
        List<Car> carByBrand;

        List<Car> allCars = getAllCars();

        carByBrand = allCars.stream().filter(c -> c.getIdBrand() == idBrand).collect(Collectors.toList());

        return carByBrand;
    }

    @Override
    public List<Car> getCarByLevel(Integer idLevel) {
        return null;
    }


}

