package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesDemo {
    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();
        //use the session object to save Java Object
        try{


            //start a transaction
            session.beginTransaction();

            //get the instructor from db
            int theId=1;
            Instructor tempInstructor =session.get(Instructor.class,theId);

            System.out.println(tempInstructor);
            //create some courses
            //Course tempCourse1 = new Course("Air Guitar- The Ultimate");
            //Course tempCourse2 = new Course("The Pinball Masterclass");
            //Course tempCourse3 = new Course("System Programming");

            //add courses to instructor
            //tempInstructor.add(tempCourse1);
            //tempInstructor.add(tempCourse2);
            //tempInstructor.add(tempCourse3);

            //save the courses
            //session.save(tempCourse1);
            //session.save(tempCourse2);
            //session.save(tempCourse3);

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
