package com.objecoriented.bookmyshow.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Auditorium extends BaseModel{
   @OneToMany
   private List<Seat> seats;
@ElementCollection
        @Enumerated(EnumType.STRING)
List<AuditoriumFeature> auditoriumFeatures;
private int capacity;
   @ManyToOne
private Theatre theatre;
}
