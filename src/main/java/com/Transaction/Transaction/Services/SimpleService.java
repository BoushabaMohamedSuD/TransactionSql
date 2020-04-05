package com.Transaction.Transaction.Services;

import com.Transaction.Transaction.Generale.CustomException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope("singleton")
public class SimpleService {
    private int index = 5;

    @Transactional(noRollbackFor = RuntimeException.class)
    public void incrementIndex() {
        this.index++;
        System.out.println(this.index);
        throw new RuntimeException("just test");
    }

    @Transactional
    public void decrementIndex() {
        this.index--;
        System.out.println(this.index);
        // new CustomException("custome Exception");
    }

    public int getIndex() {
        System.out.println("now : " + this.index);
        return this.index;
    }

}