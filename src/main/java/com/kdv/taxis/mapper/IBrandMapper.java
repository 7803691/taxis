package com.kdv.taxis.mapper;

import com.kdv.taxis.bean.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBrandMapper {

    @Select("Select * from Brand")
    public List<Brand> getAllBrandList();

    @Select("Select * from Brand where id = #{id}")
    public Brand getBrandById(Integer id);

    @Select("Select count(id) from Brand")
    public Integer getBrandCount();



}
