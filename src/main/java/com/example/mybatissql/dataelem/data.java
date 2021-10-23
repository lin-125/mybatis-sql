package com.example.mybatissql.dataelem;

public class data {
    private int no;
    private String name;
    private String sex;
    private String password;
    public data(int no,String name,String sex,String password){
        this.name=name;
        this.no=no;
        this.sex=sex;
        this.password=password;
    }

    public int getNo(){
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
