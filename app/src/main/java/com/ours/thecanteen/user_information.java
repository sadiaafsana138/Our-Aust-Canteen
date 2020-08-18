package com.ours.thecanteen;

public class user_information {
    String name,semester,year,mobile_number,password;

    public user_information(String name, String semester, String year, String mobile_number, String password) {
        this.name = name;
        this.semester = semester;
        this.year = year;
        this.mobile_number = mobile_number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSemester() {
        return semester;
    }

    public String getYear() {
        return year;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
