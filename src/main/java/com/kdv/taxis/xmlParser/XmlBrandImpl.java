package com.kdv.taxis.xmlParser;

import com.kdv.taxis.bean.Brand;
import com.kdv.taxis.config.Config;
import com.kdv.taxis.service.IBrandService;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.util.List;

public class XmlBrandImpl implements IBrandService {
    private XStream xStream;
    private File xmlFile;

    public XmlBrandImpl() {
        xStream = new XStream();
        xStream.processAnnotations(XmlBrandList.class);
        xmlFile = new File(Config.BRAND_XML);
    }

    @Override
    public List<Brand> getAllBrands (){
        XmlBrandList readObject = (XmlBrandList) xStream.fromXML(xmlFile);
        List<Brand> brandList = readObject.getBrands();
        return brandList;
    }

    @Override
    public Brand getBrandById(Integer id) {
        List<Brand> brands = getAllBrands();
        return brands.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Integer getBrandCount() {
        Integer count = getAllBrands().size();
        return count;
    }
}
