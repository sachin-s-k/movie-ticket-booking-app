package com.objecoriented.bookmyshow.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auditorium extends BaseModel{
   @OneToMany(fetch = FetchType.EAGER)
   private List<Seat> seats;
   private String  name;
@ElementCollection
@Enumerated(EnumType.STRING)
List<AuditoriumFeature> auditoriumFeatures;
private int capacity;
   @ManyToOne
private Theatre theatre;
}
