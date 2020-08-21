package com.luv2code.springdemo;


import java.util.LinkedHashMap;

public class Student {

    private String id;
    private String password;
    private String country;
    private String language;
    private String[] OperatingSystems;



    private LinkedHashMap<String,String> languageOptions;
    public String getLanguage() {
        return language;
    }
    public LinkedHashMap<String, String> getLanguageOptions() {
        return languageOptions;
    }
    public void setLanguage(String language) {
        this.language = language;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public String[] getOperatingSystems() {
        return OperatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        OperatingSystems = operatingSystems;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student(){
        languageOptions=new LinkedHashMap<>();

        languageOptions.put("java","java");
        languageOptions.put("python"," python");
        languageOptions.put("c#","c#");
        languageOptions.put("c++","c++");

    }

}
