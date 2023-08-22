package com.example.sport_app.controller;


import com.example.sport_app.model.Discipline;
import com.example.sport_app.services.SportDisciplinesService;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@RestController
public class SportDisciplinesController {
    private final SportDisciplinesService sportDisciplinesService;

    @RequestMapping("/api/v1/disciplines")
    public List<Discipline> listDiscipline(){
        return sportDisciplinesService.listDiscipline();
    }

    public Discipline getDisciplineById(UUID id){
        return sportDisciplinesService.getDiciplineById(id);
    }

}
