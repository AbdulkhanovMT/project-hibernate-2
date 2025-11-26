package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends GenericDao<FilmText> {

    public FilmTextDAO(SessionFactory sessionFactory) {

        super(FilmText.class, sessionFactory);
    }
}
