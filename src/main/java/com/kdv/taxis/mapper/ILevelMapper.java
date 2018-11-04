package com.kdv.taxis.mapper;

import com.kdv.taxis.bean.Level;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ILevelMapper {



    @Select("Select * from Level")
    public List<Level> getAllLevelCar();


    @Select("Select * from level where id =#{id}")
    public Level getLevelById(Integer id);

    @Select("Select count(id) from Brand")
    public Integer getLevelCount();
}
