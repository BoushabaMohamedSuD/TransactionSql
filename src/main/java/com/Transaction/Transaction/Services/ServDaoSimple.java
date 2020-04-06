package com.Transaction.Transaction.Services;

import com.Transaction.Transaction.Entites.Data;
import com.Transaction.Transaction.Repository.RepDaoSimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope("singleton")
public class ServDaoSimple {
    @Autowired
    public RepDaoSimple repDaoSimple;

    public Data getData(int id) {
        return this.repDaoSimple.getData(id);
    }

    public Data setData(Data data) {
        return this.repDaoSimple.setData(data);
    }

    // if you remove @transaction her
    // each query will run as an undependant transacion
    // the roll back will work just for the query that will
    // throw an unchecked exception

    @Transactional
    public Data make(Data data) {

        Data newData = new Data();
        newData.setNom("testsqs");
        newData.setDescription("testsqs");
        this.repDaoSimple.setData(newData);
        this.repDaoSimple.setData(data);
        return this.repDaoSimple.getData(5);
    }

}