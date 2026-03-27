package com.objecoriented.bookmyshow.models;


import jakarta.persistence.Entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


/**
 * For a show, for every seat type, what is the price for those seat types for that show.
 * 1 : 1
 * M : 1
 */
@Entity
@Getter
@Setter
public class ShowSeatType extends BaseModel{
  @ManyToOne
  private  Show show;
  @Enumerated(EnumType.STRING)
  private   SeatType seatType;
  private double price;
}
