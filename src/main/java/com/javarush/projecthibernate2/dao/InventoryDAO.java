package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDAO extends GenericDao<Inventory> {

    public InventoryDAO(SessionFactory sessionFactory) {

        super(Inventory.class, sessionFactory);
    }
}
