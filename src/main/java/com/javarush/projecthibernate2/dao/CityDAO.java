package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.City;
import org.hibernate.SessionFactory;

public class CityDAO extends GenericDao<City> {

    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String cityName) {
        return getCurrentSession().createQuery("select c from City c where c.city=:name", City.class)
                .setParameter("name", cityName)
                .setMaxResults(1)
                .getSingleResult();
    }
}
