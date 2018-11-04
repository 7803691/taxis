package com.kdv.taxis.xmlParserTest;

import com.kdv.taxis.xmlParser.XmlModelImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

public class XmlParserModelTest {
    private XmlModelImpl xmlModelImpl;

    @Before
    public void createObject() throws FileNotFoundException {
        this.xmlModelImpl = new XmlModelImpl();


    }

    @After
    public void releaseObject(){
        xmlModelImpl = null;

    }


    @Test
    public void xmlParserModelTest(){
        System.out.println(xmlModelImpl.getAllModels());
    }




    @Test
    public void getModelByIdFromXml(){
        System.out.println(xmlModelImpl.getModelById(1));
    }


    @Test
    public void getModelCountFromXml(){

        assert xmlModelImpl.getModelCount().equals(3);

    }
}
