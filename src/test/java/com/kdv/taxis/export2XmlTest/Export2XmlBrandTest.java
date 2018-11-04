package com.kdv.taxis.export2XmlTest;

import com.kdv.taxis.export2Xml.Export2XmlBrand;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Export2XmlBrandTest {

    private Export2XmlBrand export2XmlBrand;

    @Before
    public void createObject() throws IOException {
        this.export2XmlBrand = new Export2XmlBrand();
    }

    @After
    public void destroyObject(){
        export2XmlBrand = null;
    }

    @Test
    public void export2XMLBrandTest(){

        export2XmlBrand.getAllBrand();
    }
}
