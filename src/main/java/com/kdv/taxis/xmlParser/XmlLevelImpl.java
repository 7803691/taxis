package com.kdv.taxis.xmlParser;

import com.kdv.taxis.bean.Level;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.ILevelService;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.util.List;

public class XmlLevelImpl implements ILevelService {


    private XStream xStream;
    private File xmlFile;

    public XmlLevelImpl() {
        xStream = new XStream();
        xStream.processAnnotations(XmlLevelList.class);
        xmlFile = new File(Config.LEVEL_XML);
    }

    @Override
    public List<Level> getAllLevels (){
        XmlLevelList readObject = (XmlLevelList) xStream.fromXML(xmlFile);
        List<Level> levelList = readObject.getLevels();
        return levelList;
    }

    @Override
    public Level getLevelById(Integer id) {
        List<Level> levels = getAllLevels();
        return levels.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Integer getLevelCount() {
        Integer count = getAllLevels().size();
        return count;
    }

    

}
