package com.kdv.taxis.jsonParser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.IBrandService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonBrandImpl implements IBrandService {
    private Gson gson;
    private BufferedReader br;
    private Type brandListType;

    public JsonBrandImpl() throws FileNotFoundException {
        gson = new Gson();
        br = new BufferedReader(new FileReader(Config.BRAND_JSON));
        brandListType= new TypeToken<ArrayList<Brand>>() {
        }.getType();

    }

    public List<Brand> getAllBrands() {
        List<Brand> brandList = gson.fromJson(br, brandListType);
        return brandList;
    }

    @Override
    public Brand getBrandById(Integer id) {
        List<Brand> brands = getAllBrands();
        return brands.stream().filter(b -> b.getId() == id).findFirst().orElse(null);

    }

    @Override
    public Integer getBrandCount() {
        Integer brandCount = getAllBrands().size();
        return brandCount;
    }


}
