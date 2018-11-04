package com.kdv.taxis.export2Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kdv.taxis.bean.Car;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.CarServiceImpl;
import com.kdv.taxis.service.ICarService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;

public class Export2JsonCar {
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
        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}


