package com.kdv.taxis.xmlParserTest;

import com.kdv.taxis.xmlParser.XmlCarImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class XmlParserCarTest {
    private XmlCarImpl xmlCarImpl;

    @Before
    public void createObject() {
        this.xmlCarImpl = new XmlCarImpl();
    }

    @After
    public void releaseObject(){
        xmlCarImpl = null;

    }

    @Test
    public void xmlParserCarTest(){
        System.out.println(xmlCarImpl.getAllCars());

    }

    @Test
    public void getCarByIdFromXml(){
        System.out.println(xmlCarImpl.getCarById(2));
    }


    @Test
    public void getCarCountFromXml(){
        assert xmlCarImpl.getCarCount().equals(11);
    }


    @Test
    public void getCostOfTaxisTest(){
        System.out.println(xmlCarImpl.getCostOfTaxis());
    }

    @Test
    public void sortTaxisByFuelConsTest(){
        System.out.println(xmlCarImpl.sortTaxisByFuelCons());
    }



}
