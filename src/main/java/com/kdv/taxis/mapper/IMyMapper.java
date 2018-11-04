package com.kdv.taxis.mapper;

import org.apache.ibatis.annotations.Select;

public interface IMyMapper {

    @Select("Select version()")
    public String getMySqlVersion();
}
