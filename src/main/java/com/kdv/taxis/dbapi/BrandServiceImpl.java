package com.kdv.taxis.dbapi;

import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.mapper.IBrandMapper;
import com.kdv.taxis.service.IBrandService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class BrandServiceImpl implements IBrandService {
    private static final Logger log = LogManager.getLogger(BrandServiceImpl.class);
    private SqlSession session;
    private SqlSessionFactory factory;
    private Reader reader;

    public BrandServiceImpl() throws IOException {
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(reader);
        factory.getConfiguration().addMapper(IBrandMapper.class);
        session = factory.openSession();
    }

    public List<Brand> getAllBrands() {
        List<Brand>  allBrands = session.selectList("getAllBrandList");
        log.info("create List of Brands from DataBase");
        return allBrands;
    }

    public Brand getBrandById(Integer id) {
        Brand brand = session.selectOne("getBrandById",id);
        return brand;
    }

    public Integer getBrandCount() {
        Integer count = session.selectOne("getBrandCount");
        return count;
    }


}
