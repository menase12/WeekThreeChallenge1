package com.company;

public class Skill {
    public Skill() {
    }

    private String skill;
    private String rate;

    public String getSkill() {
        return skill;
    }

    public Skill(String skill, String rate) {
        this.skill = skill;
        this.rate = rate;
    }

    public String getRate() {

        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setSkill(String skill) {
        this.skill = skill;

    }
}