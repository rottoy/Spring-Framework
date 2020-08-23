package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {


        //Create Session Factory
        SessionFactory factory= new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();


        //Create Session
        Session session = factory.getCurrentSession();

        try{
            //create Student Objects
            Student tempStudent1 = new Student("Paul", "Wall","paul@luv2code.com");
            Student tempStudent2 = new Student("John", "Doe","mary@luv2code.com");
            Student tempStudent3 = new Student("Bonita", "Applebum","bonita@luv2code.com");

            //begin transaction and save values
            session.beginTransaction();
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            //commit to database
            session.getTransaction().commit();



        }finally {
            session.close();
        }


    }
}
