package com.luv2code.hibernate.practice;

import com.luv2code.hibernate.practice.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CRUDStudentDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();


        try{
            /*
            //Query Using Hibernate
            //Create
            session = sessionFactory.getCurrentSession();
            Student mystudent =
                    new Student("Lim","Junhyeok",
                            "wnsgur9609@naver.com");

            session.beginTransaction();
            session.save(mystudent);

            int studentId=1;

            //Read
            Student curStudent = session.get(Student.class, 1);
            System.out.println(curStudent);

            //Update

            curStudent.setEmail("wnswns@naver.com");


            //Delete
            Student deleteStudent = session.get(Student.class, 2);
            session.delete(deleteStudent);
            session.getTransaction().commit();
            */

            //Query Using HQL

            session.beginTransaction();

            //Read
            List Students=
                    session.createQuery("from Student").getResultList();
            displayStudents(Students);

            //Update
            session.createQuery("update Student set email='foo@gmail.com' where id=5").executeUpdate();

            //Delete
            session.createQuery("delete from Student where id=4").executeUpdate();
            session.getTransaction().commit();
        }
        finally {
            session.close();
        }
    }

    private static void displayStudents(List students) {
        for(Object student : students){
            System.out.println(student);
        }
    }
}
