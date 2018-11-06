package com.kdv.taxis.export2Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kdv.taxis.bean.Level;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.LevelServiceImpl;
import com.kdv.taxis.service.ILevelService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;

public class Export2JsonLevel {
    private static final Logger log = LogManager.getLogger(Export2JsonLevel.class);
    private ILevelService levelService;
    private Gson gsonBuilder;
    private FileWriter file;

    public Export2JsonLevel() throws IOException {
        levelService = new LevelServiceImpl();
        gsonBuilder = new GsonBuilder().create();
        file = new FileWriter(Config.EXPORT_LEVEL_JSON);
    }

    public void exportLevel() {
        try {
            List<Level> levelList = levelService.getAllLevels();
            write2File(file, gsonBuilder.toJson(levelList));
            log.debug("WRITE JSON FILE : " + Config.EXPORT_LEVEL_JSON);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
