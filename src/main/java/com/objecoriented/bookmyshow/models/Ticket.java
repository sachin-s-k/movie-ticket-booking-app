package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private User user;

    private double amount;
    @OneToMany
    /**
     * Ticket: showseats
     * 1 : m
     *  m : 1
     */
   private  List<ShowSeat> showseats;
   @ManyToOne
  private   Show show;

    private Payment payment;
   private boolean userBooked

}
