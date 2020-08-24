package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();


        try{

            int studentId=1;

            session=factory.getCurrentSession();
            session.beginTransaction();

            //retrieve student based on primary key
            System.out.println("\nGetting with student id : "+studentId);
            Student myStudent = session.get(Student.class,studentId);

            //delete the student
            System.out.println("Deleting student...");
            session.delete(myStudent);

            //commit the transaction
            session.getTransaction().commit();

            //NEW CODE
            session= factory.getCurrentSession();
            session.beginTransaction();

            //delete email for all students
            System.out.println("Delete  students where id equals 2");
            session.createQuery("delete from Student where id=2").executeUpdate();
            //myStudent =session.get(Student.class , studentId);
            //System.out.println(myStudent);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            factory.close();
        }

    }
}
