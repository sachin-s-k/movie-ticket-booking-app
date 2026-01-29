package com.objecoriented.bookmyshow.models;

import jakarta.persistence.*;

@Entity
public class ShowSeat  extends BaseModel{
    @ManyToOne
    Show show ;
    @ManyToOne
    Seat seat;
    @Enumerated(EnumType.STRING)
    ShowSeatStatus showSeatStatus;
}
