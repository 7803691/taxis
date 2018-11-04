package com.kdv.taxis.dbApiTest;

import com.kdv.taxis.dbapi.LevelServiceImpl;
import com.kdv.taxis.service.ILevelService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class DbApiLevelServiceTest {
    private ILevelService service;

    @Before
    public void createObject() throws IOException {
        this.service = new LevelServiceImpl();
    }

    @After
    public void destroyObject(){
        service = null;
    }

    @Test
    public void getAllLevelsTest(){
        System.out.println(service.getAllLevels());
    }
    
}
