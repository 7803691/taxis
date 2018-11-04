package com.kdv.taxis.dbapi;

import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.bean.Car;
import com.kdv.taxis.mapper.ICarMapper;
import com.kdv.taxis.service.ICarService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CarServiceImpl implements ICarService {


    private SqlSession session;
    private SqlSessionFactory factory;
    private Reader reader;

    public CarServiceImpl() throws IOException {
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(reader);
        factory.getConfiguration().addMapper(ICarMapper.class);
        session = factory.openSession();
    }

    public List<Car> getAllCars() {
        List<Car> allCars = session.selectList("getAllCar");
        return allCars;
    }


    public Car getCarById(Integer id) {
        Car car = session.selectOne("getCarById", id);
        return car;
    }

    public Integer getCarCount() {
        Integer count = session.selectOne("getCarCount");
        return count;
    }

    public Double getCostOfTaxis() {
        Double costOfTaxis = session.selectOne("getCostOfTaxis");
        return costOfTaxis;
    }

    @Override
    public List<Car> sortTaxisByFuelCons() {
        List<Car> sortedByFuelConsBrandList = session.selectList("sortTaxisByFuelCons");
        return sortedByFuelConsBrandList;
    }

    @Override
    public List<Car> getCarByBrand(Integer idBrand) {
        List<Car> carByBrand = session.selectList("getCarByBrand", idBrand);
        return carByBrand;
    }

    @Override
    public List<Car> getCarByLevel(Integer idLevel) {
        List<Car> carByLevel = session.selectList("getCarByLevel",idLevel);
        return carByLevel;
    }




}
