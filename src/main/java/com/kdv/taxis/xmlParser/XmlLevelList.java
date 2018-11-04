package com.kdv.taxis.xmlParser;

import com.kdv.taxis.bean.Level;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;



import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.kdv.taxis.bean.Level;

import java.util.List;


    @XStreamAlias("list")
    public class XmlLevelList {


        @XStreamImplicit(itemFieldName = "level")
        private List<Level> levels;


        @Override
        public String toString() {
            return String.valueOf(levels);
        }

        public List<Level> getLevels() {
            return levels;
        }
    }

