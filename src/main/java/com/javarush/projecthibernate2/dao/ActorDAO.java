package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.entity.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends GenericDao<Actor>{

    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
