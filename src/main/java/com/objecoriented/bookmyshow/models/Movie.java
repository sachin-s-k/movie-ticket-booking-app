package com.objecoriented.bookmyshow.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Movie extends BaseModel {
   private int duaration;
   @ElementCollection
   @Enumerated(EnumType.STRING)
  private  List<Language> languages;
   @ManyToMany
    private List<Actor> actors;
    private double rating;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;




}
