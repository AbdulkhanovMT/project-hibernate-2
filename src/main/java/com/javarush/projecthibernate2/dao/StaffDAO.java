package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Rental;
import com.javarush.projecthibernate2.entity.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends GenericDao<Staff> {

    public StaffDAO(SessionFactory sessionFactory) {

        super(Staff.class, sessionFactory);
    }
}
