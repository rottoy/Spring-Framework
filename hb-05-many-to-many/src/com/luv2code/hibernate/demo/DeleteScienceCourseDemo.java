package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteScienceCourseDemo {
    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();

        //use the session object to save Java Object
        try{

            //start a transaction
            session.beginTransaction();

            //get the science course from db
            int theId=10;
            Course course = session.get(Course.class, theId);

            //delete the course
            session.delete(course);


            //commit the transaction
            session.getTransaction().commit();
        }
        finally {
            //add clean up code
            session.close();
            factory.close();
        }

    }
}
