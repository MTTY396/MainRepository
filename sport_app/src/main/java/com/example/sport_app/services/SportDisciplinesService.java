package com.example.sport_app.services;


import com.example.sport_app.model.Discipline;

import java.util.List;
import java.util.UUID;

public interface SportDisciplinesService {

    List<Discipline> listDiscipline();

    Discipline getDiciplineById(UUID id);

    Discipline saveNewDiscipline(Discipline discipline);

    void updateById(UUID id, Discipline discipline);

    void deleteById(UUID id);
}

