package com.kdv.taxis.export2XmlTest;

import com.kdv.taxis.export2Xml.Export2XmlModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Export2XmlModelTest {
    private Export2XmlModel export2XmlModel;

    @Before
    public void createObject() throws IOException {
        this.export2XmlModel = new Export2XmlModel();
    }

    @After
    public void destroyObject(){
        export2XmlModel = null;
    }

    @Test
    public void export2XMLModelTest(){
        export2XmlModel.getAllModel();
    }
}
