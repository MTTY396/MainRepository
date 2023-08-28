package com.example.sport_app.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class Discipline {
    private String name;
    private UUID id;
}
