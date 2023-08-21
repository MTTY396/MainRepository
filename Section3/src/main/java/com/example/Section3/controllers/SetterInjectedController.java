package com.example.Section3.controllers;

import com.example.Section3.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

//    @Qualifier("setterGreetingBean")

    private GreetingServices greetingServices;

    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingServices( GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
