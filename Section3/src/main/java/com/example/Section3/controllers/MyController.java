package com.example.Section3.controllers;

import com.example.Section3.services.GreetingServices;
import com.example.Section3.services.GreetingServicesImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingServices greetingServices;

    public MyController() {
        this.greetingServices = new GreetingServicesImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

//        return "Hello World!";
        return greetingServices.sayGreeting();
    }

}
