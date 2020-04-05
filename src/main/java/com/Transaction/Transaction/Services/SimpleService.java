package com.Transaction.Transaction.Services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class SimpleService {
    private int index = 0;

    public void incrementIndex() {
        this.index++;
        System.out.println(this.index);
    }

    public void decrementIndex() {
        this.index--;
        System.out.println(this.index);
    }

    public int getIndex() {
        return this.index;
    }

}