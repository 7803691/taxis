package com.kdv.taxis.export2Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.BrandServiceImpl;
import com.kdv.taxis.service.IBrandService;
import com.kdv.taxis.config.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;


public class Export2JsonBrand{

   private IBrandService brandService;
   private Gson gsonBuilder;
   private FileWriter file;

    public Export2JsonBrand() throws IOException {
        brandService = new BrandServiceImpl();
        gsonBuilder = new GsonBuilder().create();
        file = new FileWriter(Config.EXPORT_BRAND_JSON);

    }

    public void exportBrand(){
       try {
           List<Brand> brandList = brandService.getAllBrands();
           write2File(file, gsonBuilder.toJson(brandList));
       } catch (IOException e) {
           e.printStackTrace();
       }

   }




}
