package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Film;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class FilmDAO extends GenericDao<Film> {

    public FilmDAO(SessionFactory sessionFactory) {

        super(Film.class, sessionFactory);
    }

    public Film getFirstAvailableFilmForRent() {
        String hql = "select f from Film f where f.id not in (select distinct film.id from Inventory)";
        Query<Film> query = getCurrentSession().createQuery(hql, Film.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
