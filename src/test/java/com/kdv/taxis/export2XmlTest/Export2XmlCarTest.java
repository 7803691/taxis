package com.kdv.taxis.export2XmlTest;

import com.kdv.taxis.export2Xml.Export2XmlCar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Export2XmlCarTest {
    private Export2XmlCar export2XmlCar;

    @Before
    public void createObject() throws IOException {
        this.export2XmlCar = new Export2XmlCar();
    }

    @After
    public void destroyObject(){
        export2XmlCar = null;
    }

    @Test
    public void export2XMLCarTest(){
        export2XmlCar.getAllCar();
    }
}
