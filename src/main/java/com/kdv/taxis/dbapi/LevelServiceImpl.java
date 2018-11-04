package com.kdv.taxis.dbapi;

import com.kdv.taxis.bean.Level;
import com.kdv.taxis.mapper.IBrandMapper;
import com.kdv.taxis.mapper.ILevelMapper;
import com.kdv.taxis.service.ILevelService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class LevelServiceImpl implements ILevelService {

    private SqlSession session;
    private SqlSessionFactory factory;
    private Reader reader;

    public LevelServiceImpl() throws IOException {
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(reader);
        factory.getConfiguration().addMapper(ILevelMapper.class);
        session = factory.openSession();
    }

    public List<Level> getAllLevels() {
        List<Level> allLevels = session.selectList("getAllLevelCar");
        return allLevels;
    }

    public Level getLevelById(Integer id) {
        Level level = session.selectOne("getLevelById",id);
        return level;
    }

    public Integer getLevelCount() {
        Integer levelCount = session.selectOne("getLevelCount");
        return levelCount;
    }
}
