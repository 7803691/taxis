package com.kdv.taxis.export2Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kdv.taxis.bean.Car;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.CarServiceImpl;
import com.kdv.taxis.service.ICarService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;

public class Export2JsonCar {
    private static final Logger log = LogManager.getLogger(Export2JsonBrand.class);
    private ICarService carService;
    private Gson gsonBuilder;
    private FileWriter file;


    public Export2JsonCar() throws IOException {

        carService = new CarServiceImpl();
        gsonBuilder = new GsonBuilder().create();
        file = new FileWriter(Config.EXPORT_CAR_JSON);
    }

    public void exportCar(){
        try {
          List<Car> carList = carService.getAllCars();
          write2File(file, gsonBuilder.toJson(carList));
          log.debug("WRITE JSON FILE : " + Config.EXPORT_CAR_JSON);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportCarToJsonById(Integer id){
        try {
            Car car = carService.getCarById(id);
            write2File(file, gsonBuilder.toJson(car));
            log.debug("WRITE JSON FILE : " + Config.EXPORT_CAR_JSON +"BY ID "+ id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


