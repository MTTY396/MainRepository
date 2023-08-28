package com.example.sport_app.controller;


import com.example.sport_app.model.Competitor;
import com.example.sport_app.model.Discipline;
import com.example.sport_app.services.SportDisciplinesService;
import lombok.AllArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RequiredArgsConstructor
@RestController
//@RequestMapping("/api/v1/disciplines")
public class SportDisciplinesController {

    private final SportDisciplinesService sportDisciplinesService;

    @RequestMapping(value = "/api/v1/disciplines/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteById(@PathVariable("id") UUID id){

        sportDisciplinesService.deleteById(id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/api/v1/disciplines/{id}", method = RequestMethod.PUT)
    public ResponseEntity updateById(@PathVariable("id") UUID id, @RequestBody Discipline discipline){

        sportDisciplinesService.updateById(id, discipline);

        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/api/v1/disciplines", method = RequestMethod.POST)
    public ResponseEntity handlePost(@RequestBody Discipline discipline){
        Discipline saveDiscipline = sportDisciplinesService.saveNewDiscipline(discipline);
        return  new ResponseEntity(HttpStatus.CREATED);
    }


    @RequestMapping(value = "/api/v1/disciplines", method = RequestMethod.GET)
    public List<Discipline> listDiscipline(){
        return sportDisciplinesService.listDiscipline();
    }

    @RequestMapping(value = "/api/v1/disciplines/{id}", method = RequestMethod.GET)
    public Discipline getDisciplineById(@PathVariable("id") UUID id){
        return sportDisciplinesService.getDiciplineById(id);
    }

}
