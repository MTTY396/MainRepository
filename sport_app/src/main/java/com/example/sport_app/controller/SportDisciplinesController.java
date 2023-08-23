package com.example.sport_app.controller;


import com.example.sport_app.model.Discipline;
import com.example.sport_app.services.SportDisciplinesService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@RestController
//@RequestMapping("/api/v1/disciplines")
public class SportDisciplinesController {
    private final SportDisciplinesService sportDisciplinesService;

    @RequestMapping(value = "/api/v1/disciplines", method = RequestMethod.GET)
    public List<Discipline> listDiscipline(){
        return sportDisciplinesService.listDiscipline();
    }

    @RequestMapping(value = "/api/v1/disciplines/{id}", method = RequestMethod.GET)
    public Discipline getDisciplineById(@PathVariable("id") UUID id){
        return sportDisciplinesService.getDiciplineById(id);
    }

}
