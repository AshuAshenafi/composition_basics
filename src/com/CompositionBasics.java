package com;

import java.util.ArrayList;

public class CompositionBasics {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();

        ////////////////////////////////first person///////////////////////////////////
        ArrayList<Education> schoolPassed1 = new ArrayList<>();

        // first school for the first person
        Education ed1 = new Education();
        ed1.setSchoolName("Stratfor University");
        ed1.setSchoolAddress("Fairfax, VA");
        ed1.setAcademicYear(2010);
        schoolPassed1.add(ed1);

        // second school for the first person
        Education ed2 = new Education();
        ed2.setSchoolName("The George Washington University");
        ed2.setSchoolAddress("Washington, DC");
        ed2.setAcademicYear(2014);
        schoolPassed1.add(ed2);

        // third school for the first person
        Education ed3 = new Education();
        ed3.setSchoolName("University of Maryland");
        ed3.setSchoolAddress("College Park, MD");
        ed3.setAcademicYear(2018);
        schoolPassed1.add(ed3);

        // fourth school for the first person
        Education ed4 = new Education();
        ed4.setSchoolName("American University");
        ed4.setSchoolAddress("Washington, DC");
        ed4.setAcademicYear(2020);
        schoolPassed1.add(ed4);

        // add job and person
        Job jb1 = new Job("Full Stack Java Developer", 150_000, "EMP200");
        Person prs1 = new Person("David John", jb1, schoolPassed1);
        personList.add(prs1);

        ////////////////////////////////second person///////////////////////////////////
        ArrayList<Education> schoolPassed2 = new ArrayList<>();

        // add first school for second person
        Education ed5 = new Education();
        ed5.setSchoolName("Georgetwon University");
        ed5.setSchoolAddress("Washington, DC");
        ed5.setAcademicYear(2011);
        schoolPassed2.add(ed5);

        // add second school for second person
        Education ed6 = new Education();
        ed6.setSchoolName("Howard University");
        ed6.setSchoolAddress("Washington, DC");
        ed6.setAcademicYear(2019);
        schoolPassed2.add(ed6);

        // assign job to second person
        Job j2 = new Job("Back-End Java Developer", 120_000, "EMP201");
        Person prs2 = new Person("Zola Scaggs", j2, schoolPassed2);
        personList.add(prs2);

        // print list of person
        for(Person p : personList){
            System.out.println(p.toString());
        }
    }
}
