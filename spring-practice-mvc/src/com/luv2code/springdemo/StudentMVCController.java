package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;

@Controller
@RequestMapping("mvc")
public class StudentMVCController {

    @Value("#{context_countryOptions}")
    public LinkedHashMap<String,String> java_countryOptions;

    @RequestMapping("student/showForm")
    public String showForm(Model model){
        Student student = new Student();

        model.addAttribute("model_student",student);

        model.addAttribute("model_countryOptions",java_countryOptions);



        return "student-form";
    }


    @RequestMapping("student/processForm")
    public String processForm(@ModelAttribute("model_student") Student theStudent){
        return "student-confirmation";
    }
}
