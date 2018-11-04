package com.kdv.taxis.jsonParserTest;

import com.kdv.taxis.jsonParser.JsonModelImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class JsonParserModelTests {
    private JsonModelImpl jsonModelImpl;


    @Before
    public void createObject() throws FileNotFoundException {

        this.jsonModelImpl = new JsonModelImpl();
    }

    @After
    public void destroyObject(){
        jsonModelImpl = null;
    }


    @Test
    public void allModelParseTest()  {
        System.out.println(jsonModelImpl.getAllModels());
    }
}
