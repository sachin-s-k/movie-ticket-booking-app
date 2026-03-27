package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Theatre extends BaseModel{
    String name;
    @OneToMany(mappedBy="theatre",fetch = FetchType.EAGER)
    private  List<Auditorium> auditoriums;
    @OneToMany
    private List<Show> upcomingShows;
    private String address;


}
