package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
        //spring will automatically attach the prefix/suffix and find the file
        return "main-menu";
    }
}
