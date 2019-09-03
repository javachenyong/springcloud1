package com.zb.enilty;

import java.io.Serializable;

public class Fenzhuang implements Serializable {
    private String name;
    private Integer deptdi;
    private Integer index;
    private Integer size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeptdi() {
        return deptdi;
    }

    public void setDeptdi(Integer deptdi) {
        this.deptdi = deptdi;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
