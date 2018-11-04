package com.kdv.taxis.dbapi;

import com.kdv.taxis.bean.Model;
import com.kdv.taxis.mapper.IModelMapper;
import com.kdv.taxis.service.IModelService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ModelServiceImpl implements IModelService {

    private SqlSession session;
    private SqlSessionFactory factory;
    private Reader reader;

    public ModelServiceImpl() throws IOException {
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(reader);
        factory.getConfiguration().addMapper(IModelMapper.class);
        session = factory.openSession();
    }

    public List<Model> getAllModels (){
        List<Model> allModels = session.selectList("getAllModel");
        return allModels;
    }

    public Model getModelById(Integer id) {
        Model model = session.selectOne("getModelById",id);
        return model;
    }

    public Integer getModelCount() {
        Integer count = session.selectOne("getModelCount");
        return count;
    }
}
