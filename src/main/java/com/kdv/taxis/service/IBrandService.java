package com.kdv.taxis.service;

import com.kdv.taxis.bean.Brand;

import java.util.List;

public interface IBrandService {
    List<Brand> getAllBrands();

    Brand getBrandById(Integer id);

    Integer getBrandCount();



}
