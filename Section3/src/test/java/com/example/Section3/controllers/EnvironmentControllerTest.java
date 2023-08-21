package com.example.Section3.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles ({"PROD", "EN"})
@SpringBootTest
class EnvironmentControllerTest {
    @Autowired
    EnvironmentController controller;

    @Test
    void  getEnvironment(){
        System.out.println(controller.getEnvironment());
    }
}