package com.kdv.taxis.export2JsonTest;

import com.kdv.taxis.export2Json.Export2JsonModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Export2JsonModelTest {
    private Export2JsonModel export2JsonModel;

    @Before
    public void createObject() throws IOException {
        this.export2JsonModel  = new Export2JsonModel();
    }

    @After
    public void destroyObject(){
        export2JsonModel = null;
    }

    @Test
    public void export2AllJsonModelTest() throws IOException {
        export2JsonModel.exportModel();
    }

}
