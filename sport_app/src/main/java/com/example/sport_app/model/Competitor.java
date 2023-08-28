package com.example.sport_app.model;


import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Competitor {

    private String firstName;
    private String lastName;
    private String age;
    private String startNumber;
    private UUID id;

}
