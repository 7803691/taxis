package com.kdv.taxis.mapper;

import com.kdv.taxis.bean.Model;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IModelMapper {

    @Select("Select * from Model")
    List<Model> getAllModel();

    @Select("Select * from Model where id = #{id}")
    Model getModelById(Integer id);


    @Select("Select count(id) from Model")
    Integer getModelCount();

}
