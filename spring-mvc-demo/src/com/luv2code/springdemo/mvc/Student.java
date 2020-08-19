package com.luv2code.springdemo.mvc;

public class Student {

    public String getFirstName() {
        System.out.println("getFirstName called "+firstName);
        return firstName;
    }

    public String getLastName() {
        System.out.println("getLastName called : "+lastName);
        return lastName;
    }

    public void setFirstName(String firstName) {
        System.out.println("getFirstName called "+firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        System.out.println("setLastName called : "+lastName);
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public Student(){

    }

}
