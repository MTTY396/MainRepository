package com.example.sport_app.model;


import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Competitor {

    private String name;
    private UUID id;

}
