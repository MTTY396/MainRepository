package com.example.Section3.services.i18n;

import com.example.Section3.services.GreetingServices;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"default", "EN"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
