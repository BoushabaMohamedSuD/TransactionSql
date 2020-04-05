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

}