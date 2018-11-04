package com.kdv.taxis.export2XmlTest;

import com.kdv.taxis.export2Xml.Export2XmlLevel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Export2XmlLevelTest {
    private Export2XmlLevel export2XmlLevel;

    @Before
    public void createObject() throws IOException {
        this.export2XmlLevel = new Export2XmlLevel();
    }

    @After
    public void destroyObject(){
        export2XmlLevel = null;
    }

    @Test
    public void export2XMLLevelTest(){
        export2XmlLevel.getAllLevel();
    }
}
