import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {


    public static void main(String[] args) {
        SessionFactory ourSessionFactory = new Configuration().
                configure().
                addAnnotatedClass(Book.class).
                addAnnotatedClass(BookStore.class).
                buildSessionFactory();
        Session session = ourSessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            System.out.println("querying all the managed entities...");
            BookStore bookStore=new BookStore();
            bookStore.setName("시애틀 책방");
            session.save(bookStore);

            Book book = new Book();
            session.save(book);
            book.setTitle("JPA 좀 공부하면서 쓰세요.");

            bookStore.add(book);


            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
}