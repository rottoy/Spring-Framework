package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseAndStudentsDemo {
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

            //Create
            //start a transaction
            session.beginTransaction();

            //create a course
            Course tempCourse = new Course("Science");

            //save the course
            //insert query
            System.out.println("\nSaving the course ....");
            session.save(tempCourse);
            System.out.println("Save the course : "+tempCourse);

            //create a student
            Student tempStudent = new Student("John","Doe","john2@luv2code.com");
            Student tempStudent2 = new Student("Maryt","Public","mary@luv2code.com");

            //add students to the course
            //다대다 관계 형성 부분
            tempCourse.addStudent(tempStudent);
            tempCourse.addStudent(tempStudent2);

            //save the students
            //insert query
            System.out.println("\nSaving students...");
            session.save(tempStudent);
            session.save(tempStudent2);
            System.out.println("Saved students "+tempCourse.getStudents());

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
