package com.sznetweb.daivd.ribbon.web;

import com.sznetweb.daivd.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi() {
        return helloService.hiService();
    }
}