package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Staff;
import com.javarush.projecthibernate2.entity.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends GenericDao<Store> {

    public StoreDAO(SessionFactory sessionFactory) {

        super(Store.class, sessionFactory);
    }
}
