package com.techjobsstl.Tech_Jobs_STL_Backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue
    private Integer id;
    private String jobTitle;
    private String businessName;
    private String location;
    private String website;
    private String postDate;
    private Boolean isFeatured;
    private String logoFilePath;

}
