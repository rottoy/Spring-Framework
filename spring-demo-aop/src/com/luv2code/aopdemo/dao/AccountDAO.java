package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public String addAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass()+"DOING MY DB WORK : ADDING AN ACCOUNT");

        return "";
    }
}
