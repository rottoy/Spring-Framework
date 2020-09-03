package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(DemoConfig.class);

        //get the bean from spring container
        AccountDAO accountDAO=  context.getBean("accountDAO",AccountDAO.class);
        MembershipDAO membershipDAO=context.getBean("membershipDAO",MembershipDAO.class);


        //call the business method
        Account myAccount =new Account();
        accountDAO.addAccount(myAccount,true);
        membershipDAO.addSillyMember();

        //close the context
        context.close();
    }
}
