package com.example.Section3.controllers.i18n;


import com.example.Section3.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {

    private final GreetingServices greetingServices;

    public MyI18NController(@Qualifier("i18NService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
