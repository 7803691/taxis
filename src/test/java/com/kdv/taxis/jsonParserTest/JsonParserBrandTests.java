package com.kdv.taxis.jsonParserTest;

import com.kdv.taxis.jsonParser.JsonBrandImpl;
import com.kdv.taxis.jsonParser.JsonCarImpl;
import com.kdv.taxis.jsonParser.JsonLevelImpl;
import com.kdv.taxis.jsonParser.JsonModelImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.FileNotFoundException;

public class JsonParserBrandTests {

    private JsonBrandImpl jsonBrandImpl;


    @Before
    public void createObject() throws FileNotFoundException {

        this.jsonBrandImpl = new JsonBrandImpl();
    }

    @After
    public void destroyObject(){
        jsonBrandImpl = null;
    }


    @Test
    public void allBrandParseTest() throws FileNotFoundException {
        System.out.println(jsonBrandImpl.getAllBrands());
    }




}
