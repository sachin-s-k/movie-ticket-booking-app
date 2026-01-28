package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public class Seat extends BaseModel {

    private int seatNumber;

    private SeatType seatType;
}
