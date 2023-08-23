package com.example.sport_app.controller;


import com.example.sport_app.model.Competitor;
import com.example.sport_app.services.CompetitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/competitor")
@RequiredArgsConstructor
@RestController
public class CompetitorController {

    private final CompetitorService competitorService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Competitor> listAllCompetitors(){
        return competitorService.getAllCompetitors();
    }

    @RequestMapping("/{id}")
    public Competitor getCompetitorById(@PathVariable("id") UUID id){
        return competitorService.getCompetitorById(id);
    }
}
