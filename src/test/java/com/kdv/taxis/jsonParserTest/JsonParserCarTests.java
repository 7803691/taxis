package com.kdv.taxis.jsonParserTest;

import com.kdv.taxis.jsonParser.JsonCarImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class JsonParserCarTests {
    private JsonCarImpl jsonCarImpl;


    @Before
    public void createObject() throws FileNotFoundException {

        this.jsonCarImpl = new JsonCarImpl();
    }

    @After
    public void destroyObject(){
        jsonCarImpl = null;
    }


    @Test
    public void allCarParseTest()  {
        System.out.println(jsonCarImpl.getAllCars());
    }

    @Test
    public void getCarByIdTest(){
        System.out.println(jsonCarImpl.getCarById(3));
    }

    @Test
    public void getCarByBrand() {
        System.out.println(jsonCarImpl.getCarByBrand(2));
    }

    @Test
    public void getCostOfTaxis() {
        System.out.println(jsonCarImpl.getCostOfTaxis());
    }
}
