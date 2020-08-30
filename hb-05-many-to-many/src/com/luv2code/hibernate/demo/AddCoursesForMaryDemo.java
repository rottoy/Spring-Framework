package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCoursesForMaryDemo {
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

            //get the student mary from database
            int theId=2;
            Student tempStudent = session.get(Student.class, theId);

            System.out.println("\nLoaded student: "+tempStudent);
            System.out.println("Course : "+tempStudent.getCourses());

            Course tempCourse1= new Course("linux programming");
            Course tempCourse2= new Course("hadoop programming");

            System.out.println("\nSaving the courses...");
            session.save(tempCourse1);
            session.save(tempCourse2);

            System.out.println();
            //create more courses and add Courses
            tempStudent.addCourse(tempCourse1);
            tempStudent.addCourse(tempCourse2);

            /*
            * Course tempCourse1= new Course("linux programming");
            * Course tempCourse2= new Course("hadoop programming");
            * tempCourse1.addStudent(tempStudent);
            * tempCourse2.addStudent(tempStudent);
            * session.save(tempCourse1);
            * session.save(tempCourse2);
            * */



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
