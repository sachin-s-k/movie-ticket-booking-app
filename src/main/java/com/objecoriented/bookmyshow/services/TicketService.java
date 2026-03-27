package com.objecoriented.bookmyshow.services;

import com.objecoriented.bookmyshow.exceptions.ShowSeatNotAvailableException;
import com.objecoriented.bookmyshow.models.ShowSeat;
import com.objecoriented.bookmyshow.models.ShowSeatStatus;
import com.objecoriented.bookmyshow.models.Ticket;
import com.objecoriented.bookmyshow.models.TicketStatus;
import com.objecoriented.bookmyshow.repositories.ShowRepository;
import com.objecoriented.bookmyshow.repositories.ShowseatRepository;
import com.objecoriented.bookmyshow.repositories.TicketRepository;
import com.objecoriented.bookmyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final ShowRepository showRepository;
    private final ShowseatRepository showseatRepository;
    private final UserRepository userRepository;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(Long showId, List<Long> seatIds,Long userId){

      var showSeats= showseatRepository.findAllById(seatIds);
      for(ShowSeat showSeat: showSeats){
          if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE) ){

              throw new ShowSeatNotAvailableException("ShowSeat ID: " +
                    showSeat.getId() + " not available.");
          }
      }
        for (ShowSeat showSeat: showSeats) {
            showSeat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showseatRepository.save(showSeat);
        }
        var show= showRepository.findById(showId).orElse(null);
        var user= userRepository.findById(userId).orElse(null);
        Ticket ticket = new Ticket();
        ticket.setShow(show);
        ticket.setShowSeats(showSeats);
        ticket.setUser(user);
        ticket.setTicketStatus(TicketStatus.PENDING);
        ticket.setDateOfBooking(new Date());
        var savedTicket= ticketRepository.save(ticket);
        return  savedTicket;

    }
}
