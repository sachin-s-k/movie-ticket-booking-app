package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity
public class Actor  extends  BaseModel{
    private String name;
    @ManyToMany (mappedBy="actors")
    List<Movie> movies;
}
