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
        Discipline discipline5 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("rzut dyskiem")
                .build();
        Discipline discipline6 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("rzut oszczepem")
                .build();
        Discipline discipline7 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("pływanie")
                .build();
        Discipline discipline8 = Discipline.builder()
                .id(UUID.randomUUID())
                .name("jazda na rowerze")
                .build();

        disciplineMap.put(discipline1.getId(), discipline1);
        disciplineMap.put(discipline2.getId(), discipline2);
        disciplineMap.put(discipline3.getId(), discipline3);
        disciplineMap.put(discipline4.getId(), discipline4);
        disciplineMap.put(discipline5.getId(), discipline5);
        disciplineMap.put(discipline6.getId(), discipline6);
        disciplineMap.put(discipline7.getId(), discipline7);
        disciplineMap.put(discipline8.getId(), discipline8);
    }

    @Override
    public List<Discipline> listDiscipline(){
        return new ArrayList<>(disciplineMap.values());
    }


    @Override
    public Discipline getDiciplineById(UUID id) {
        return disciplineMap.get(id);
    }

    @Override
    public Discipline saveNewDiscipline(Discipline discipline) {

        Discipline savedDiscipline = Discipline.builder()
                .name(discipline.getName())
                .id(UUID.randomUUID())
                .build();

        disciplineMap.put(savedDiscipline.getId(), savedDiscipline);
        return savedDiscipline;
    }

    @Override
    public void updateById(UUID id, Discipline discipline) {
        Discipline existing = disciplineMap.get(id);
        existing.setName(discipline.getName());

        disciplineMap.put(existing.getId(), existing);
    }

    @Override
    public void deleteById(UUID id) {
        disciplineMap.remove(id);
    }
}
