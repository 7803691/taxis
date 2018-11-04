package com.kdv.taxis.mapper;

import com.kdv.taxis.bean.Car;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ICarMapper {

    @Select("Select * from Car")
    public List<Car> getAllCar();


    @Select("Select * from Car where id= #{id}")
    public Car getCarById(Integer id);


    @Select("Select count(id) from Car")
    public Integer getCarCount();

    @Select("Select sum(cost) from Car")
    public Double getCostOfTaxis();

    @Select("Select * from Car order by fuelCons")
    List<Car> sortTaxisByFuelCons();

    @Select("Select * from Car WHERE idBrand = #{idBrand}")
    List<Car> getCarByBrand(Integer idBrand);

    @Select("Select * from Car where idLevel = #{id}")
    List<Car> getCarByLevel(Integer idLevel);




}
