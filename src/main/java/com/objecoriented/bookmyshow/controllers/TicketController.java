package com.objecoriented.bookmyshow.controllers;

import com.objecoriented.bookmyshow.models.Ticket;
import com.objecoriented.bookmyshow.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    public Ticket bookTicket(Long showId, List<Long> seatIds, Long userId){

     return  ticketService.bookTicket(showId,seatIds,userId);
    }

}
