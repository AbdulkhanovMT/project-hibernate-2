package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends GenericDao<Payment> {

    public PaymentDAO(SessionFactory sessionFactory) {

        super(Payment.class, sessionFactory);
    }
}
