package com.kdv.taxis.jsonParser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.bean.Level;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.ILevelService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonLevelImpl implements ILevelService {

    private Gson gson;
    private BufferedReader br;
    private Type levelListType;

    public JsonLevelImpl() throws FileNotFoundException {

        gson = new Gson();
        br = new BufferedReader(new FileReader(Config.LEVEL_JSON));
        levelListType= new TypeToken<ArrayList<Level>>() {
        }.getType();

    }

    public List<Level> getAllLevels() {
        List<Level> levelList = gson.fromJson(br, levelListType);
        return levelList;
    }

    @Override
    public Level getLevelById(Integer id) {
        List<Level> levels = getAllLevels();
        return levels.stream().filter(b -> b.getId() == id).findFirst().orElse(null);

    }

    @Override
    public Integer getLevelCount() {
        Integer levelCount = getAllLevels().size();
        return levelCount;
    }

}
