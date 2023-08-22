package com.example.sport_app.services;

import com.example.sport_app.model.Discipline;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class SportDisciplinesServiceImpl implements SportDisciplinesService {
    private Map<UUID, Discipline> disciplineMap;

    public SportDisciplinesServiceImpl(){

        this.disciplineMap = new HashMap<>();

        Discipline discipline1 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("bieg na 100m")
                .build();
        Discipline discipline2 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("bieg przez plotki")
                .build();

        Discipline discipline3 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("skok w dal")
                .build();

        Discipline discipline4 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("skok wzwyż")
                .build();

        disciplineMap.put(discipline1.getId(), discipline1);
        disciplineMap.put(discipline2.getId(), discipline2);
        disciplineMap.put(discipline3.getId(), discipline3);
        disciplineMap.put(discipline4.getId(), discipline4);
    }

    @Override
    public List<Discipline> listDiscipline(){
        return new ArrayList<>(disciplineMap.values());
    }


    @Override
    public Discipline getDiciplineById(UUID id) {
        return disciplineMap.get(id);
    }
}
