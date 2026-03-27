package com.objecoriented.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Ticket extends BaseModel {
    @ManyToOne
    private User user;
    private double amount;
    @ManyToMany
    private  List<ShowSeat> showSeats;
    @ManyToOne
    private   Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
    private Date dateOfBooking;
    private boolean userBooked;

}
