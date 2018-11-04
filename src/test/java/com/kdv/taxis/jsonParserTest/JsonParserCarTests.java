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
    public void allCarParseTest() throws FileNotFoundException {
        System.out.println(jsonCarImpl.getAllCars());
    }

    @Test
    public void getCarByIdTest(){
        System.out.println(jsonCarImpl.getCarById(3));
    }
}
