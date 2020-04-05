package com.Transaction.Transaction.Repository;

import javax.persistence.EntityManager;
import org.hibernate.Session;

import com.Transaction.Transaction.Entites.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope("singleton")
public class RepDaoSimple {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Data getData(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Data data = currentSession.get(Data.class, id);
        return data;
    }

    @Transactional
    public Data setData(Data data) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(data);
        return data;
    }

}