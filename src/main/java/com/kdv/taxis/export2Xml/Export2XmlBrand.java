package com.kdv.taxis.export2Xml;

import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.dbapi.BrandServiceImpl;
import com.kdv.taxis.dbapi.BrandServiceImpl;
import com.kdv.taxis.service.IBrandService;
import com.kdv.taxis.service.IBrandService;
import com.thoughtworks.xstream.XStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.kdv.taxis.config.Writer.write2File;

public class Export2XmlBrand {

    private IBrandService brandService;
    private XStream xStream;
    private FileWriter file;

    public Export2XmlBrand() throws IOException {
        brandService = new BrandServiceImpl();
        xStream = new XStream();
        xStream.processAnnotations(Brand.class);
        file = new FileWriter(Config.EXPORT_BRAND_XML);


    }

    public void getAllBrand(){
        try {
            List<Brand> brandList = brandService.getAllBrands();
            write2File(file, xStream.toXML(brandList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
