package com.kdv.taxis.xmlParserTest;

import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.jsonParser.JsonBrandImpl;
import com.kdv.taxis.xmlParser.*;
import com.thoughtworks.xstream.persistence.XmlArrayList;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class XmlParserBrandTest {
    private XmlBrandImpl xmlBrandImpl;

    @Before
    public void createObject() throws FileNotFoundException {
        this.xmlBrandImpl = new XmlBrandImpl();


    }

    @After
    public void releaseObject(){
        xmlBrandImpl = null;

    }


    @Test
    public void xmlParserBrandTest(){

        List<Brand> allBrands = xmlBrandImpl.getAllBrands();
        Brand testBrand1 = new Brand();
        Brand testBrand2 = new Brand();
        Brand testBrand3 = new Brand();
        testBrand1.setId(1);
        testBrand1.setName("AUDI");
        testBrand2.setId(2);
        testBrand2.setName("VW");
        testBrand3.setId(3);
        testBrand3.setName("FORD");

        assertThat(allBrands, containsInAnyOrder(
                testBrand1,
                testBrand2,
                testBrand3

        ));


    }




    @Test
    public void getBrandByIdFromXml(){
       System.out.println(xmlBrandImpl.getBrandById(1));
    }


    @Test
    public void getBrandCountFromXml(){
        assert xmlBrandImpl.getBrandCount().equals(6);

    }
}