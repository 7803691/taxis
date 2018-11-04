package com.kdv.taxis.service;

import com.kdv.taxis.bean.Car;

import java.util.List;

public interface ICarService {


    List<Car> getAllCars();

    Car getCarById(Integer id);

    Integer getCarCount();

    Double getCostOfTaxis();

    List<Car> sortTaxisByFuelCons();

    List<Car> getCarByBrand(Integer idBrand);

    List<Car> getCarByLevel(Integer idLevel);





}
