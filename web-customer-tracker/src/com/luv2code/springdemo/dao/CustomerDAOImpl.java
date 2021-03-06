package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    //need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public List<Customer> getCustomers() {

        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //create a  ... sort by last name
        Query<Customer> theQuery =
                currentSession.createQuery("from Customer order by lastName",
                        Customer.class);

        //execute query and get result list
        List<Customer> customers= theQuery.getResultList();


        //return the results
        return customers;
    }

    @Override
    public Customer getCustomer(int theId) {
        //get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //retrieve/read from databse using the primary key
        Customer theCustomer = currentSession.get(Customer.class,theId);

        return theCustomer;
    }

    @Override
    public void saveCustomer(Customer theCustomer) {

        //get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        //save the customer ... finally LOL
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public void deleteCustomer(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();


        Query theQuery=
                currentSession.createQuery("delete from Customer where id=:theId");
        theQuery.setParameter("theId",theId);

        theQuery.executeUpdate();

    }
}
