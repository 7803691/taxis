package com.kdv.taxis.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level = (Level) o;
        return id == level.id &&
                Objects.equals(name, level.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
