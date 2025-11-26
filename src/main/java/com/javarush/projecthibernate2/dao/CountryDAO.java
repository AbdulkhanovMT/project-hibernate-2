package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends GenericDao<Country> {

    public CountryDAO(SessionFactory sessionFactory) {

        super(Country.class, sessionFactory);
    }
}
