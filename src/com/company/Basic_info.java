package com.company;

import java.util.ArrayList;

public class Basic_info {
    private String firstName;

    public ArrayList<School> getSchools() {
        return school;
    }

    public Basic_info() {
        this.school = new ArrayList<School>();
        this.exper_iances = new ArrayList<Exper_iance>();
        this.skills = new ArrayList<Skill>();
    }

    public void setSchools(ArrayList<School> school) {
        this.school = school;
    }

    public ArrayList<Exper_iance> getExper_iances() {
        return exper_iances;
    }

    public void setExper_iances(ArrayList<Exper_iance> exper_iances) {
        this.exper_iances = exper_iances;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    private String lastName;
    private String email;
    private ArrayList<School> school;
    private ArrayList<Exper_iance>exper_iances;
    private ArrayList<Skill>skills;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<School> getSchool() {
        return school;
    }

    public void setSchool(ArrayList<School> school) {
        this.school = school;
    }

    public void addSchool(School aSchool){
        school.add(aSchool);
    }

    public void addExper_ience(Exper_iance aExper_iance){exper_iances.add(aExper_iance);}

    public void addSkill(Skill aSkill){skills.add(aSkill);}
}