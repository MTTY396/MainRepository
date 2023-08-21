package com.example.Section3.services;


import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting";
    }
}
