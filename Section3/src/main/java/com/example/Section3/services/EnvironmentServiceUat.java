package com.example.Section3.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String getEnvy() {
        return "UAT";
    }
}
