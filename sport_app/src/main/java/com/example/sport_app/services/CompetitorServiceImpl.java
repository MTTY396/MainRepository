package com.example.sport_app.services;

import com.example.sport_app.model.Competitor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CompetitorServiceImpl implements CompetitorService {

    private Map<UUID, Competitor> competitorMap;

    public CompetitorServiceImpl(){

        this.competitorMap = new HashMap<>();

        Competitor competitor1 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 1")
                .build();
        Competitor competitor2 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 2")
                .build();
        Competitor competitor3 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 3")
                .build();
        Competitor competitor4 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 4")
                .build();
        Competitor competitor5 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 5")
                .build();
        Competitor competitor6 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 6")
                .build();
        Competitor competitor7 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 7")
                .build();
        Competitor competitor8 = Competitor.builder()
                .id(UUID.randomUUID())
                .name("Zawodnik nr 8")
                .build();

        competitorMap.put(competitor1.getId(), competitor1);
        competitorMap.put(competitor2.getId(), competitor2);
        competitorMap.put(competitor3.getId(), competitor3);
        competitorMap.put(competitor4.getId(), competitor4);
        competitorMap.put(competitor5.getId(), competitor5);
        competitorMap.put(competitor6.getId(), competitor6);
        competitorMap.put(competitor7.getId(), competitor7);
        competitorMap.put(competitor8.getId(), competitor8);
    }


    @Override
    public List<Competitor> getAllCompetitors() {
        return new ArrayList<>(competitorMap.values());
    }

    @Override
    public Competitor getCompetitorById(UUID id) {
        return competitorMap.get(id);
    }
}
