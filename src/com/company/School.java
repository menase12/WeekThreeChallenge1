package com.company;

public class School {
    private String school;

    public School() {
    }

    public School(String school, String major, String level, String graduatedYear) {
        this.school = school;
        this.major = major;
        this.level = level;
        this.graduatedYear = graduatedYear;
    }

    private String major;
    private String level;
    private String graduatedYear;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGraduatedYear() {
        return graduatedYear;
    }

    public void setGraduatedYear(String graduatedYear) {
        this.graduatedYear = graduatedYear;
    }
}

