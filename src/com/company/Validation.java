package com.company;

import java.util.ArrayList;

public class Validation {

        private String name;
        private String email;
        private int leastEducation;
        private int maxEducation;
        private int leastExperiance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLeastEducation() {
        return leastEducation;
    }

    public void setLeastEducation(int leastEducation) {
        this.leastEducation = leastEducation;
    }

    public int getMaxEducation() {
        return maxEducation;
    }

    public void setMaxEducation(int maxEducation) {
        this.maxEducation = maxEducation;
    }

    public int getLeastExperiance() {
        return leastExperiance;
    }

    public void setLeastExperiance(int leastExperiance) {
        this.leastExperiance = leastExperiance;
    }

    public int getMaxExperiance() {
        return maxExperiance;
    }

    public void setMaxExperiance(int maxExperiance) {
        this.maxExperiance = maxExperiance;
    }

    public int getLeastSkill() {
        return leastSkill;
    }

    public void setLeastSkill(int leastSkill) {
        this.leastSkill = leastSkill;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

    public ArrayList<Exper_iance> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Exper_iance> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public int getMaxSkill() {
        return maxSkill;

    }

    public void setMaxSkill(int maxSkill) {
        this.maxSkill = maxSkill;
    }

    private int maxExperiance;
        private int leastSkill;
        private int maxSkill;

        private ArrayList<School> schools;
        private ArrayList<Exper_iance> experiences;
        private ArrayList<Skill> skills;

    public Validation() {
        this.schools = schools;
        this.experiences = experiences;
        this.skills = skills;
    }
   public void addValidation1 (School add0,Exper_iance add1,Skill add2){
        schools.add(add0);
        experiences.add(add1);
        skills.add(add2);
 }
 //public

//        public Validation(){
//            name = "";
//            email= "";
//            informations = new ArrayList<School>();
//            leastEducation = 1;
//            maxEducation = 10;
//            leastExperiance = 0;
//            maxExperiance = 10;
//            leastSkill = 1;
//            maxSkill = 20;
//
//        }
//
////
////        public Validation(String name, String email, ArrayList<ResumeItem> resumeItems) {
////            name = name;
////            this.email = email;
////            this.resumeItems = resumeItems;
////
////            edExpMinNumber = 1;
////            edExpMaxNumber = 10;
////            jobExpMinNumber = 0;
////            jobExpMaxNumber = 10;
////            skillMinNumber = 1;
////            skillMaxNumber = 20;
////        }
//
//
//
//        public int getEducationalExpNumber() {
//            int counter=0;
//            for (School resumeItem:informations)
//            {
//                if(resumeItem.getClass().getSimpleName().equals("EducationalExperience")) {
//                    counter++;
//                }
//            }
//
//            return counter;
//        }
//
//
//        public int getJobExpNumber() {
//            int counter=0;
//            for (ResumeItem resumeItem:resumeItems)
//            {
//                if(resumeItem.getClass().getSimpleName().equals("JobExperience")) {
//                    counter++;
//                }
//            }
//            return counter;
//        }
//
//
//        public int getSkillsNumber() {
//            int counter=0;
//            for (ResumeItem resumeItem:resumeItems)
//            {
//                if(resumeItem.getClass().getSimpleName().equals("Skill")) {
//                    counter++;
//                }
//            }
//
//            return counter;
//        }
//
//
//        // write the resume in a string
//        public String toString(){
//
//            String ResItemString = "";
//            int counter1 = 0;
//            int counter2 = 0;
//            int counter3 = 0;
//
//            for (ResumeItem resumeItem:resumeItems)
//            {
//
//                if (resumeItem.getClass().getSimpleName().equals("EducationalExperience"))
//                {
//                    if(counter1 == 0) {
//                        ResItemString += (char)27 + "[1mEducation"+ (char)27 + "[0m\n";
//                        counter1++;
//                    }
//                }else if (resumeItem.getClass().getSimpleName().equals("JobExperience"))
//                {
//                    if(counter2 == 0) {
//                        ResItemString += (char)27 + "[1mExperience" + (char)27 + "[0m\n";
//                        counter2++;
//                    }
//                }else if(resumeItem.getClass().getSimpleName().equals("Skill")) {
//                    if (counter3 == 0) {
//                        ResItemString += (char)27 + "[1mSkills" + (char)27 + "[0m\n";
//                        counter3++;
//                    }
//                }
//                ResItemString = ResItemString+ resumeItem +"\n";
//            }
//
//            return  (char)27 + "[1m"+name + (char)27 + "[0m\n"+
//                    email + "\n\n" +
//                    ResItemString ;
//        }
//
//
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        public ArrayList<ResumeItem> getResumeItems() {
//            return resumeItems;
//        }
//
//        public void setResumeItems(ArrayList<ResumeItem> resumeItems) {
//            this.resumeItems = resumeItems;
//        }
//
//        public int getEdExpMaxNumber() {
//            return edExpMaxNumber;
//        }
//
//        public int getJobExpMaxNumber() {
//            return jobExpMaxNumber;
//        }
//
//        public int getSkillMaxNumber() {
//            return skillMaxNumber;
//        }
//
//        public int getEdExpMinNumber() {
//            return edExpMinNumber;
//        }
//
//        public int getJobExpMinNumber() {
//            return jobExpMinNumber;
//        }
//
//        public int getSkillMinNumber() {
//            return skillMinNumber;
//        }
//
//        public void addResumeItem(ResumeItem resumeItem) {
//            resumeItems.add(resumeItem);
//        }
//
//    }


}
