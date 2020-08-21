package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String procesForm(){
        return "helloworld";
    }

    //new a controller method to read form data and
    //add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        //read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        //convert data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Yoas345435dsad! " + theName;

        //add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){


        //convert data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Hey My Friend from v3!  " + theName;

        //add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }
}
