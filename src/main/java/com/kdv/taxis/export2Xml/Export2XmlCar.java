package com.kdv.taxis.export2Xml;

import com.kdv.taxis.bean.Car;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.CarServiceImpl;
import com.kdv.taxis.service.ICarService;
import com.thoughtworks.xstream.XStream;

import static com.kdv.taxis.config.Writer.write2File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Export2XmlCar {

    private ICarService carService;
    private XStream xStream;
    private FileWriter file;

    public Export2XmlCar() throws IOException {
        carService = new CarServiceImpl();
        xStream = new XStream();
        xStream.processAnnotations(Car.class);
        file = new FileWriter(Config.EXPORT_CAR_XML);


    }

    public void getAllCar(){
        try {
            List<Car> carList = carService.getAllCars();
            write2File(file, xStream.toXML(carList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}