package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session= sessionFactory.getCurrentSession();

        try{
            //start a transaction
            session.beginTransaction();

            int theId=1;
            //option 2 :Hibernate query with HQL
            //Fetch join 을 사용하면 그와 연관된 엔티티에 대한 정보 모두 불러올 수 있다.
            Query<Instructor> query=
                    session.createQuery("select i from Instructor i " +
                                    "JOIN FETCH i.courses "
                            +"where i.id=:theInstructorId",
                            Instructor.class);

            //set parameter on query
            query.setParameter("theInstructorId", theId);

            //execute query and get instructor
            Instructor tempInstructor= query.getSingleResult();

            //get the instructor from db
            System.out.println("luv2code Instructor : "+tempInstructor);
            session.getTransaction().commit();
        }finally {
            session.close();
        }
    }
}
