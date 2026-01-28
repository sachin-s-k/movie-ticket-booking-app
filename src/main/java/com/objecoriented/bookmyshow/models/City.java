package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class City  extends BaseModel{
    private String name;
    private String imageUrl;
    @OneToMany
    private  List<Theatre> theatreList;
}
