package com.kdv.taxis.xmlParserTest;

import com.kdv.taxis.xmlParser.XmlLevelImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class XmlParserLevelTest {


    private XmlLevelImpl xmlLevelImpl;

    @Before
    public void createObject() throws FileNotFoundException {
        this.xmlLevelImpl = new XmlLevelImpl();


    }

    @After
    public void releaseObject(){
        xmlLevelImpl = null;

    }


    @Test
    public void xmlParserLevelTest(){
        System.out.println(xmlLevelImpl.getAllLevels());
    }




    @Test
    public void getLevelByIdFromXml(){
        System.out.println(xmlLevelImpl.getLevelById(1));
    }


    @Test
    public void getLevelCountFromXml(){

       assert xmlLevelImpl.getLevelCount().equals(3);

    }
}
