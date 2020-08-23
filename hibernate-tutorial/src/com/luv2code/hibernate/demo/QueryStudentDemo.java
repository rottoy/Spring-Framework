package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{
            //start a transaction;
            session.beginTransaction();

            //query Student
            List theStudents = session.createQuery("from Student").getResultList();

            //display the students
            displayStudents(theStudents);

            //query students : lastName='Doe';
            System.out.println("\nAnother Query Initiating...");
            System.out.println("Students who have last name : Doe");
            theStudents = session.createQuery("from Student s where s.lastName='Doe' ").getResultList();
            displayStudents(theStudents);

            //query students :lastName='Doe' or FirstName ='John';
            System.out.println("\nAnother Query Initiating...");
            System.out.println("Students who have last name : Doe or first name : John");
            theStudents = session.createQuery("from Student s where s.lastName='Doe' or s.firstName='John' ").getResultList();
            displayStudents(theStudents);

            System.out.println("\nAnother Query Initiating...");
            System.out.println("Students who have last name : Doe or first name : John");
            theStudents = session.createQuery("from Student s where s.email like '%luv2code.com' ").getResultList();
            displayStudents(theStudents);


            session.getTransaction().commit();

            System.out.println("Done!");

        }finally {
            session.close();
        }
    }

    private static void displayStudents(List theStudents) {
        for (Object tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }
}
