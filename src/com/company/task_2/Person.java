package com.company.task_2;

public class Person {
    private String first_Name;
    private String last_Name;
    private String middle_Name;

    public Person(String first_Name, String last_Name, String middle_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.middle_Name = middle_Name;
    }

    public Person(String last_Name) {
        this.last_Name = last_Name;
        first_Name = "";
        middle_Name = "";
    }

    public Person(String first_Name, String last_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        middle_Name = "";
    }

    public String toString() {
        if (!middle_Name.equals("") && !first_Name.equals("")) {
            middle_Name = middle_Name.substring(0,1) + ".";
            first_Name = first_Name.substring(0,1) + ".";
        } else if (middle_Name.equals("") && !first_Name.equals("")) {
            first_Name = first_Name.substring(0,1) + ".";
        }
        else{
            first_Name = "";
            middle_Name = "";
        }
        return String.format("%s %s%s", last_Name, first_Name, middle_Name);
    }
}
