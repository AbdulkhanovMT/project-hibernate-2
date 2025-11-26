package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends GenericDao<Category> {

    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
