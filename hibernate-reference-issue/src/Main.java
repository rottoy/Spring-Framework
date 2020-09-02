import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.
                    addAnnotatedClass(Book.class).
                    addAnnotatedClass(BookStore.class).
                    buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            BookStore bookStore=new BookStore();
            bookStore.setName("시애틀 책방");
            session.save(bookStore);

            Book book = new Book();
            book.setTitle("JPA 좀 공부하면서 쓰세요.");

            bookStore.add(book);

            session.save(book);
        } finally {
            session.close();
        }
    }
}