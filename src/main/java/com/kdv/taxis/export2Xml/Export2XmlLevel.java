package com.kdv.taxis.export2Xml;

import com.kdv.taxis.bean.Level;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.LevelServiceImpl;
import com.kdv.taxis.service.ILevelService;
import com.thoughtworks.xstream.XStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;

public class Export2XmlLevel {
    private ILevelService levelService;
    private XStream xStream;
    private FileWriter file;

    public Export2XmlLevel() throws IOException {
        levelService = new LevelServiceImpl();
        xStream = new XStream();
        xStream.processAnnotations(Level.class);
        file = new FileWriter(Config.EXPORT_LEVEL_XML);


    }

    public void getAllLevel(){
        try {
            List<Level> levelList = levelService.getAllLevels();
            write2File(file, xStream.toXML(levelList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
