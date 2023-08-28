package com.example.sport_app.controller;


import com.example.sport_app.model.Competitor;
import com.example.sport_app.services.CompetitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/competitor")
@RequiredArgsConstructor
@RestController
public class CompetitorController {
    private final CompetitorService competitorService;

@DeleteMapping("{id}")
    public ResponseEntity deleteById(@PathVariable("id") UUID id){

        competitorService.deleteById(id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @PutMapping("{id}")
    public ResponseEntity updateById(@PathVariable("id") UUID id, @RequestBody Competitor competitor){

        competitorService.updateById(id, competitor);

        return  new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @PostMapping
    public ResponseEntity handlePost(@RequestBody Competitor competitor){

        Competitor saveCompetitor = competitorService.saveNewCompetitor(competitor);
        return  new ResponseEntity(HttpStatus.CREATED);

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Competitor> listAllCompetitors(){
        return competitorService.getAllCompetitors();
    }

    @RequestMapping("/{id}")
    public Competitor getCompetitorById(@PathVariable("id") UUID id){
        return competitorService.getCompetitorById(id);
    }
}
