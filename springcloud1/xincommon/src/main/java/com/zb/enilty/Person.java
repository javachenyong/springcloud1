package com.zb.enilty;

import java.io.Serializable;

public class Person implements Serializable {
    private Integer id;
    private String name;
    private String adds;
    private Integer age;
    private Dept deptdi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDeptdi() {
        return deptdi;
    }

    public void setDeptdi(Dept deptdi) {
        this.deptdi = deptdi;
    }
}
