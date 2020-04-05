package com.Transaction.Transaction.RestController;

import com.Transaction.Transaction.Services.SimpleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private SimpleService simpleService;

    @GetMapping("/")
    public String sayHello() {
        return "hello mohamed";
    }

    @GetMapping("/inc")
    public int inc() {
        this.simpleService.incrementIndex();
        return this.simpleService.getIndex();
    }

    @GetMapping("/dec")
    public int dec() {
        this.simpleService.decrementIndex();
        return this.simpleService.getIndex();
    }

    @GetMapping("/now")
    public int now() {
        return this.simpleService.getIndex();
    }

}