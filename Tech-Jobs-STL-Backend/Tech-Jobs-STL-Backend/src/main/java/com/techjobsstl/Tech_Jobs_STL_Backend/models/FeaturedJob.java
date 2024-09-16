package com.techjobsstl.Tech_Jobs_STL_Backend.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class FeaturedJob extends Job {
    @Id
    @GeneratedValue
    private Integer id;
    private String logoFile;
    private String email;

    //TODO: getters, setters, constructors

}
