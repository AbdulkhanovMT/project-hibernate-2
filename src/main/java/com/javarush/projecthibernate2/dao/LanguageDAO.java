package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Inventory;
import com.javarush.projecthibernate2.entity.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends GenericDao<Language> {

    public LanguageDAO(SessionFactory sessionFactory) {

        super(Language.class, sessionFactory);
    }
}
