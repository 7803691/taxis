package com.kdv.taxis.service;

import com.kdv.taxis.bean.Level;

import java.util.List;

public interface ILevelService {



    List<Level> getAllLevels();

    Level getLevelById(Integer id);

    Integer getLevelCount();

}
