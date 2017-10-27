
package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //basic information
        String yes="";
        Scanner choice=new Scanner(System.in );
        Scanner keyboard = new Scanner(System.in);
        Basic_info basic_info = new Basic_info();
        Exper_iance exper_ianceience = new Exper_iance();

        School school = new School();
        Skill skills = new Skill();
        int educationCount = 0;
        int experianceCount = 0;
        int skillcount = 0;
        int counter = 20;
        ArrayList<Basic_info>basic_infos = new ArrayList<Basic_info>();

        System.out.print("Please enter your First name: ");
        basic_info.setFirstName(keyboard.nextLine());
        System.out.print("Enter you last name: ");
        basic_info.setLastName(keyboard.nextLine());
        System.out.print("Provide your email address: ");
        basic_info.setEmail(keyboard.nextLine());
        basic_infos.add(basic_info);

        //Schooll
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your education below");
        System.out.println("\n");
        do {
            System.out.println("Please state your school: ");
            school.setSchool(input.nextLine());
            System.out.print("Please tell your major: ");
            school.setMajor(input.nextLine());
            System.out.print("Please tell your degree level (BS or MS): ");
            school.setLevel(input.nextLine());
            System.out.print("please tell your graduation year (yyyy) format: ");
            school.setGraduatedYear(input.nextLine());
           // System.out.println("Debug school object "+ school.getSchool() + school.getGraduatedYear());

            basic_info.addSchool(school);

            System.out.println("You have entered " + (educationCount) + " Educational Achievements");

            educationCount++;
            if (educationCount < 10)
            System.out.println("Would you like to add more education? (Y/N)");
            yes = keyboard.nextLine();
        } while (!yes.equalsIgnoreCase("n")&& educationCount <=10);

        //Experiance

        System.out.println("Experience");
        System.out.println("Please enter your experience below ");
        do {
            System.out.println("Please tell where did you work before: ");
            exper_ianceience.setWhere(input.nextLine());
            //experienceList.add(thePerson);
            System.out.print("Please tell your position: ");
            exper_ianceience.setPosition(input.nextLine());
            //experienceList.add(thePerson);
            System.out.print("For how long you worked? (Please enter joined year and after your last year) ");
            exper_ianceience.setDate(input.nextLine());
            //experienceList.add(thePerson);
            exper_ianceience.setDate2(input.nextLine());
            //experienceList.add(thePerson);
            System.out.print("please tell what was your duty: ");
            exper_ianceience.setDuty(input.next());
            //experienceList.add(thePerson);
            basic_info.addExper_ience(exper_ianceience);
            System.out.println ("You have entered" +(educationCount)+" experiance");
            experianceCount++;


            if (experianceCount <= 10)

            System.out.println("Would you like to add more Work Experinces? (Y/N)");

            yes=choice.nextLine();

        }while(!yes.equalsIgnoreCase("n")&& experianceCount <=10);
        System.out.println("\n");


        //Skill
        do{
            for(int i=0; i>counter; i++)
            System.out.println("Please enter your skill");
            skills.setSkill(input.nextLine());
            System.out.println("Please enter your rate");
            skills.setRate(input.nextLine());
            System.out.println("Would you like to add more skills (Y/N)");
            basic_info.addSkill(skills);
            skillcount++;
            if(skillcount>counter)
            {
                System.out.println("Would you like to add more skills? (Y/N)");
            }
            yes=choice.nextLine();
        }while(!yes.equalsIgnoreCase("n")&& skillcount<=counter);



        System.out.println("==============================================================");
        System.out.println(basic_info.getFirstName()+" "+basic_info.getLastName()+"\n"+basic_info.getEmail());
        System.out.print("\n");
        System.out.println("Education");
        System.out.println("==============================================================");
        for(School eachSchool: basic_info.getSchool())
        {
            System.out.println(eachSchool.getLevel()+ " in " + eachSchool.getMajor()+",\n"+eachSchool.getSchool()+", "+eachSchool.getGraduatedYear());
        }
        System.out.println("Experiance");
        System.out.println("==============================================================");
        for (Exper_iance eachDuty: basic_info.getExper_iances()) {
            System.out.println(eachDuty.getPosition() + "\n" + eachDuty.getWhere() + "," + eachDuty.getDate() + " - " + eachDuty.getDate2());
            System.out.println("- Duty: "+eachDuty.getDuty());
        }
        System.out.println("Skills and Rate");
        System.out.println("=============================================================");
        for(Skill eachSkill: basic_info.getSkills()) {
            System.out.print(eachSkill.getSkill() + "\n");
            System.out.println(eachSkill.getRate());
        }
    }
}


