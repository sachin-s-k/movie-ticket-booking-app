package com.objecoriented.bookmyshow.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class ShowSeat {
    @ManyToOne
    Show show ;
    @ManyToOne
    Seat seat;
    @Enumerated(EnumType.STRING)
    ShowSeatStatus showSeatStatus;
}
