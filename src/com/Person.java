package com;

import java.util.ArrayList;

public class Person {
    private String name;
    //composition has-a relationship
    private Job job;
    //person may pass upto ten schools
    private ArrayList<Education> schools = new ArrayList<>();

    public Person() {
    }

    public Person(String name, Job job, ArrayList<Education> schools) {
        this.name = name;
        this.job = job;
        this.schools = schools;
    }

    public long getSalary() {
        return job.getSalary();
    }

    public ArrayList<Education> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<Education> schools) {
        this.schools = schools;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSchools(Education edu) {
        schools.add(edu);
    }

    public void displayPerson() {
    }

    public String toString() {
        String retVal = "\n---------------------------------------------------\n";
        retVal = "Name: " + getName() + "\nJob: " + job.toString() + "\nSchools attended: \n";
        for (Education edu : schools) {
            retVal += edu.toString();
            retVal += "\n---------------------------------------------------\n";
        }
        retVal += "\n===================================================\n";
        return retVal;
    }
}
