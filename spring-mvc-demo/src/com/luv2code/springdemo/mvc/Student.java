package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedHashMap;

public class Student {



    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    private LinkedHashMap<String ,String>favoriteLanguageOptions;

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }


    //public LinkedHashMap<String, String> getCountryOptions() {
    //    return countryOptions;
    //}
    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getFirstName() {
       // System.out.println("getFirstName called "+firstName);
        return firstName;
    }

    public String getLastName() {
       // System.out.println("getLastName called : "+lastName);
        return lastName;
    }

    public void setFirstName(String firstName) {
      //  System.out.println("getFirstName called "+firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
       // System.out.println("setLastName called : "+lastName);
        this.lastName = lastName;
    }
    public Student(){
        //populate country options : used ISO country code
        //countryOptions = new LinkedHashMap<>();
        //countryOptions.put("BR", "Brazil");
        //countryOptions.put("FR", "France");
       // countryOptions.put("DE", "Germany");
        //countryOptions.put("IN", "India");
        favoriteLanguageOptions = new LinkedHashMap<>();
        favoriteLanguageOptions.put("C#","C#");
        favoriteLanguageOptions.put("Java","Java");
        favoriteLanguageOptions.put("PHP","PHP");
        favoriteLanguageOptions.put("RUBY","RUBY");

    }


}
