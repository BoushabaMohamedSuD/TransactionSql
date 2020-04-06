package com.Transaction.Transaction.RestController;

import com.Transaction.Transaction.Entites.Data;
import com.Transaction.Transaction.Services.ServDaoSimple;
import com.Transaction.Transaction.Services.SimpleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private SimpleService simpleService;
    @Autowired
    private ServDaoSimple servDaoSimple;

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

    @GetMapping("/{id}")
    public Data getData(@PathVariable int id) {
        System.out.println(id);
        return this.servDaoSimple.getData(id);
    }

    @PostMapping("/set")
    public Data setData(@RequestBody Data data) {
        return this.servDaoSimple.setData(data);
    }

    @PostMapping("/make")
    public Data makeData(@RequestBody Data data) {
        System.out.println("make!!!!!!!!!!!!!!!!!!!!!");
        return this.servDaoSimple.make(data);
    }

}