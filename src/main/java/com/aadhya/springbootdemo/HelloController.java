package com.aadhya.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController
{
    @GetMapping("/")
    public String homePage()
    {
        System.out.println("In controller class");
        System.out.println("In controller class");
        return "Hello Page";
    }
}
