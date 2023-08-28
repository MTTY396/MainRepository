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
                .lastName("Nowak")
                .firstName("Jan")
                .age("22")
                .startNumber("1")
                .build();
        Competitor competitor2 = Competitor.builder()
                .id(UUID.randomUUID())
                .lastName("Michał")
                .firstName("Kot")
                .age("26")
                .startNumber("2")
                .build();
        Competitor competitor3 = Competitor.builder()
                .id(UUID.randomUUID())
                .lastName("Nowak")
                .firstName("Przemysław")
                .age("22")
                .startNumber("3")
                .build();
        Competitor competitor4 = Competitor.builder()
                .id(UUID.randomUUID())
                .lastName("Kowalski")
                .firstName("Karol")
                .age("19")
                .startNumber("4")
                .build();
        Competitor competitor5 = Competitor.builder()
                .id(UUID.randomUUID())
                .lastName("Wójcik")
                .firstName("Jan")
                .age("30")
                .startNumber("5")
                .build();
        Competitor competitor6 = Competitor.builder()
                .id(UUID.randomUUID())
                .lastName("Kowalczyk")
                .firstName("Wojciech")
                .age("27")
                .startNumber("6")
                .build();
        Competitor competitor7 = Competitor.builder()
                .id(UUID.randomUUID())
                .lastName("Wiśniewski")
                .firstName("Tomasz")
                .age("21")
                .startNumber("7")
                .build();
        Competitor competitor8 = Competitor.builder()
                .id(UUID.randomUUID())
                .lastName("Kamiński")
                .firstName("Jakub")
                .age("21")
                .startNumber("8")
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

    @Override
    public Competitor saveNewCompetitor(Competitor competitor) {

        Competitor savedCompetitor = Competitor.builder()
                .firstName(competitor.getFirstName())
                .lastName(competitor.getLastName())
                .age(competitor.getAge())
                .startNumber(competitor.getStartNumber())
                .id(UUID.randomUUID())
                .build();

        competitorMap.put(savedCompetitor.getId(), savedCompetitor);

        return savedCompetitor;
    }

    @Override
    public void updateById(UUID id, Competitor competitor) {
        Competitor existing = competitorMap.get(id);
        existing.setFirstName(competitor.getFirstName());
        existing.setLastName(competitor.getLastName());
        existing.setAge(competitor.getAge());
        existing.setStartNumber(competitor.getStartNumber());
        competitorMap.put(existing.getId(), existing);
    }

    @Override
    public void deleteById(UUID id) {
        competitorMap.remove(id);
    }
}
