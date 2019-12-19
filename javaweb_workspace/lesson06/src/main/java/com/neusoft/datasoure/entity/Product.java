package com.neusoft.datasoure.entity;

import java.io.Serializable;

public class Product implements Serializable {

    public Product() {
    }

    public Product(Integer pid, String pname, String unit, Integer count, String mark) {
        this.pid = pid;
        this.pname = pname;
        this.unit = unit;
        this.count = count;
        this.mark = mark;
    }

    private Integer pid;

    private String pname;

    private String unit;

    private Integer count;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    private String mark;
}
