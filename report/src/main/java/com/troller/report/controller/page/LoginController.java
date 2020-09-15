package com.troller.report.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String viewLogin(Model model){ // send parameters to front-end
        model.addAttribute("login-message","로그인이 필요합니다.");
        return "login";
    }

}
