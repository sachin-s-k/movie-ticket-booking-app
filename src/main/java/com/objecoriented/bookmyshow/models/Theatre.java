package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity
public class Theatre extends BaseModel{
    String name;
    @OneToMany(mappedBy="theatre")
   private  List<Auditorium> auditoriums;
    @OneToMany
     private List<Show> upcomingShows;
    private String address;


}
