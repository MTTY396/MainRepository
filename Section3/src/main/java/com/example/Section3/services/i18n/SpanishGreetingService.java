package com.example.Section3.services.i18n;

import com.example.Section3.services.GreetingServices;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
