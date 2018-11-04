package com.kdv.taxis.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("level")
public class Level {
        @XStreamAlias("id")
        private int id;
        @XStreamAlias("name")
        private String name;

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
