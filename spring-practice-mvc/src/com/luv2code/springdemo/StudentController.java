package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Map;

@Controller
public class StudentController {

    @RequestMapping("student/showForm")
    public String showForm(){
        return "student-form";
    }

    //version 1 : 그냥 돌려주기.jsp에서 param.??? 으로 접근 가능
    @RequestMapping("student/processForm")
    public String processForm(){
        return "student-confirmation";
    }

    //version 2-1 : 모델에 데이터 매핑하여 돌려주기. 일반적으로 인자 받음
    // jsp에서 모델의 attribute name으로 접근 가능
    @RequestMapping("student/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model){

                String id = request.getParameter("studentId");
                String password = request.getParameter("studentPassword");




                model.addAttribute("studentId",id);
                model.addAttribute("studentPassword",password);
                return "student-confirmation";
    }
    //version 2-1 : 모델에 데이터 매핑하여 돌려주기. 어노테이션을 통해 인자 받음
    @RequestMapping("student/processFormVersionThree")
    public String processFormVersionThree(
             @RequestParam("studentId") String id,
             @RequestParam("studentPassword") String password, Model model){

        model.addAttribute("studentId",id);
        model.addAttribute("studentPassword",password);
        return "student-confirmation";
    }
}
