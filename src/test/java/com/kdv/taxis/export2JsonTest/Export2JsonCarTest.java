package com.kdv.taxis.export2JsonTest;

import com.kdv.taxis.export2Json.Export2JsonCar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Export2JsonCarTest {
    private Export2JsonCar export2JsonCar;

    @Before
    public void createObject() throws IOException {
        this.export2JsonCar  = new Export2JsonCar();
    }

    @After
    public void destroyObject(){
        export2JsonCar = null;
    }

    @Test
    public void export2AllJsonCarTest() throws IOException {
        export2JsonCar.exportCar();
    }


}
