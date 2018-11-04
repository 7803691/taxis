package com.kdv.taxis.xmlParser;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.kdv.taxis.bean.Brand;

import java.util.List;


@XStreamAlias("list")
public class XmlBrandList {


    @XStreamImplicit(itemFieldName = "brand")
    private List<Brand> brands;

    public List<Brand> getBrands() {
        return brands;
    }

    @Override
    public String toString() {
        return String.valueOf(brands);
    }
}