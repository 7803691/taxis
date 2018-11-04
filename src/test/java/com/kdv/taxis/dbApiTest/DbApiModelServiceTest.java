package com.kdv.taxis.dbApiTest;

import com.kdv.taxis.dbapi.ModelServiceImpl;
import com.kdv.taxis.service.IModelService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class DbApiModelServiceTest {
    private IModelService service;

    @Before
    public void createObject() throws IOException {
        this.service = new ModelServiceImpl();
    }

    @After
    public void destroyObject(){
        service = null;
    }

    @Test
    public void getAllModelsTest(){
        System.out.println(service.getAllModels());
    }
    
}
