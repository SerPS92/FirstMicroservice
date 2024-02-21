package com.example.FirstMicroservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello(){
        System.out.println("Hello");
        return "Hello with Spring";
    }

    @GetMapping(value = "hello/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello(@PathVariable(name = "name") String name){
        System.out.println("Hello with name");
        return "Welcome to Spring: " + name;
    }

    @GetMapping(value = "helloNameAge", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello(@RequestParam(name = "name") String name,
                        @RequestParam(name = "age") int age){
        System.out.println("Hello with name and age");
        return "Hello, " + name + ": " +  age;
    }
}
