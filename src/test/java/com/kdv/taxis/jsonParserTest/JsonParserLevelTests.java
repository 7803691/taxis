package com.kdv.taxis.jsonParserTest;

import com.kdv.taxis.jsonParser.JsonLevelImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class JsonParserLevelTests {
    private JsonLevelImpl jsonLevelImpl;


    @Before
    public void createObject() throws FileNotFoundException {

        this.jsonLevelImpl = new JsonLevelImpl();
    }

    @After
    public void destroyObject(){
        jsonLevelImpl = null;
    }


    @Test
    public void allLevelParseTest() throws FileNotFoundException {
        System.out.println(jsonLevelImpl.getAllLevels());
    }
}
