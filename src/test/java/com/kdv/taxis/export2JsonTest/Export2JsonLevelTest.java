package com.kdv.taxis.export2JsonTest;

import com.kdv.taxis.export2Json.Export2JsonLevel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Export2JsonLevelTest {
    private Export2JsonLevel export2JsonLevel;

    @Before
    public void createObject() throws IOException {
        this.export2JsonLevel  = new Export2JsonLevel();
    }

    @After
    public void destroyObject(){
        export2JsonLevel = null;
    }
    @Test
    public void export2AllJsonLevelTest() throws IOException {
        export2JsonLevel.exportLevel();
    }


}
