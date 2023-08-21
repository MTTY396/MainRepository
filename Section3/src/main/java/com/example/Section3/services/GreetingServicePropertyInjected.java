package com.example.Section3.services;

import org.springframework.stereotype.Service;

@Service ("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Don't let friends to property injection!";
    }
}
