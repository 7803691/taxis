package com.kdv.taxis.dbApiTest;

import com.kdv.taxis.bean.Level;
import com.kdv.taxis.dbapi.LevelServiceImpl;
import com.kdv.taxis.service.ILevelService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class DbApiLevelServiceTest {
    private ILevelService service;
    private Level testLevel;

    @Before
    public void createObject() throws IOException {
        this.service = new LevelServiceImpl();
        testLevel =new Level();
        testLevel.setId(1);
        testLevel.setName("PASSENGER");
    }

    @After
    public void destroyObject(){
        service = null;
    }

    @Test
    public void getAllLevelsTest(){
        assertThat(service.getAllLevels(), hasSize(3));

    }

    @Test
    public void getLevelById() {
        assert(service.getLevelById(1).getName().equals("PASSENGER"));
    }

    @Test
    public void getLevelCount() {
        assert (service.getLevelCount().equals(3));
    }
}
