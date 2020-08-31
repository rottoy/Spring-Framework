package com.junhyeok.lim.dao;

import com.junhyeok.lim.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//get data from hibernate and return data to Controller
@Repository
public class CustomerDAOlmpl implements CustomerDAO{

    //sessionFactory injection
    @Autowired
    private SessionFactory sessionFactory;

    //use hibernate
    @Override
    @Transactional
    public List<Customer> getCustomers() {

        Session currentSession=sessionFactory.getCurrentSession();
        Query<Customer> theQuery=
                currentSession.createQuery("from Customer",Customer.class);
        List<Customer> customers=theQuery.getResultList();
        return customers;
    }
}
