package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class InvitationController {

    @Autowired
    private InvitationDAO invitationDAO;

    @GetMapping("/invitation")
    public Invitation invitation(HttpServletRequest request){

        String userInvitation= request.getParameter("userId");

        System.out.println(userInvitation);
        Invitation tempInvitation = invitationDAO.getInvitations(userInvitation);
        System.out.println(tempInvitation);

        return tempInvitation;
    }
}
