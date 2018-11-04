package com.kdv.taxis.dbApiTest;

import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.bean.Car;
import com.kdv.taxis.service.ICarService;
import com.kdv.taxis.dbapi.CarServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class DbApiCarServiceTest {

    private ICarService carService;

    @Before
    public void createObject() throws IOException {
        this.carService = new CarServiceImpl();
    }

    @After
    public void destroyObject(){
        carService = null;
    }


    @Test
    public void getAllCarsTest(){
        System.out.println(carService.getAllCars());
    }



    @Test
    public void getCostOfTaxis() throws IOException {
      Double costOfTaxis = carService.getCostOfTaxis();
      //assert costOfTaxis.equals(393880.0);
     }

     @Test
     public void getCarByTest(){
        Car carById = carService.getCarById(2);
         System.out.println(carById);
     }

     @Test
    public void sortTaxisByFuelConsTest() throws IOException {
        System.out.println(carService.sortTaxisByFuelCons());

     }

     @Test
    public void getCarByBrandTest(){
         System.out.println(carService.getCarByBrand(2));
     }

    @Test
    public void getCarByLevelTest() {
        System.out.println(carService.getCarByLevel(1));

    }

}
