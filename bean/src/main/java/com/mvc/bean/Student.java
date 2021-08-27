package com.mvc.bean;

import java.io.Serializable;

public class Student implements Serializable {

private String stuname;
private String stuaddress;


    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress;
    }
}
