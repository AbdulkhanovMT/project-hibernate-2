package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Actor;
import com.javarush.projecthibernate2.entity.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends GenericDao<Address> {

    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
