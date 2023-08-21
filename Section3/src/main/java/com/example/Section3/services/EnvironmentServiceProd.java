package com.example.Section3.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String getEnvy() {
        return "PROD";
    }
}
