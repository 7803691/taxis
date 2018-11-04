package com.kdv.taxis.export2JsonTest;

import com.kdv.taxis.export2Json.Export2JsonBrand;
import com.kdv.taxis.export2Json.Export2JsonCar;
import com.kdv.taxis.export2Json.Export2JsonLevel;
import com.kdv.taxis.export2Json.Export2JsonModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class Export2JsonBrandTest {

    private Export2JsonBrand export2JsonBrand;

    @Before
    public void createObject() throws IOException {
        this.export2JsonBrand  = new Export2JsonBrand();
    }

    @After
    public void destroyObject(){
        export2JsonBrand = null;
    }




    @Test
    public void export2AllJsonBrandTest() throws IOException {
        export2JsonBrand.exportBrand();
    }


}
