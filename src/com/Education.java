package com;

public class Education {
    private String schoolName;
    private String schoolAddress;
    private int academicYear;


    public Education() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public String toString() {

        String returnValue = "\tSchool Name: " + getSchoolName() + ",\n\tSchool Address: " + getSchoolAddress() + "\n\tAcademic Year: " + getAcademicYear();

        return returnValue;

    }

}
