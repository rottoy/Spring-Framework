package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Value("#{countryOptions}")
    private LinkedHashMap<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        //create a new student object
        Student theStudent = new Student();

        //add a student object to the model
        theModel.addAttribute("student",theStudent);

        //add the country options to the model

        theModel.addAttribute("theCountryOptions",countryOptions);

        //Call Getter Method of Student in JSP
        return "student-form";
    }

    //Call Setter Method of Student in Controller
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute ("student") Student theStudent){
        //log the input data
        System.out.println(theStudent.getFirstName()+" "+theStudent.getLastName());

        //Call Getter Method of Student in JSP
        return "student-confirmation";
    }
}
