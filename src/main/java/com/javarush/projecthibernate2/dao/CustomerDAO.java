package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Customer;
import org.hibernate.SessionFactory;

public class CustomerDAO extends GenericDao<Customer> {

    public CustomerDAO(SessionFactory sessionFactory) {

        super(Customer.class, sessionFactory);
    }
}
