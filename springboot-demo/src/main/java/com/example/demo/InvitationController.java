package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class InvitationController {

    @Autowired
    private InvitationDAO invitationDAO;

    @GetMapping("/invitation")
    public Invitation invitation(HttpServletRequest request){

        String userId= request.getParameter("userId");
        System.out.println(userId);

        Invitation tempInvitation = invitationDAO.getInvitations(userId);
        System.out.println(tempInvitation);

        return tempInvitation;
    }

    @PostMapping("/invitation/{userId}")
    public String acceptInvitation(@PathVariable String userId,
                                   @RequestParam(value = "approved")Boolean approved){

        System.out.println("승인 여부 : "+approved);
        Invitation tempInvitation = invitationDAO.getInvitations(userId);

        String message = "";
        if(approved){
            message=userId + "가 해당 사건을 수락하였습니다!";

            invitationDAO.approveRequest(tempInvitation);
        }
        else{
            message=userId+"가 해당 사건을 수락하지 않았습니다!";
            invitationDAO.rejectRequest(tempInvitation);
        }
        System.out.println(message);
        return message;
    }
}
// 옛날 프레임워크 = 프론트 + 백 부분이랑 합쳐서 당연시하게 만들어왔음.
// 아무리 모노리틱 아키텍쳐라도 , 프론트랑 백을 나누어 놨음
// 따라서 백에서는 responseBody만 제대로 제공해주면 된다.

//지금 지식으로만 가지고는 스프링은 다른 프레임워크에 비해 구데기다.
//이유는 트렌드에 맞지않는것같다.
//JSON 만들기도 힘들고 받기도 힘든데...
//왜 MSA에서는 스프링이 좋다고 여겨지는 것일까?

//zuul api gateway, netflix oss
