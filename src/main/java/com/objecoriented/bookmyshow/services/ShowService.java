package com.objecoriented.bookmyshow.services;

import com.objecoriented.bookmyshow.models.*;
import com.objecoriented.bookmyshow.repositories.AuditoriumRepository;
import com.objecoriented.bookmyshow.repositories.ShowRepository;
import lombok.AllArgsConstructor;
import org.hibernate.type.SetType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class ShowService {
    private final ShowRepository showRepository;
    private final AuditoriumRepository auditoriumRepository;


    public Show addShow(Long auditoriumId, Date startTime,
                        Date endTime,
                        Long movieId,
                        Map<SeatType,Integer> seatPricing,
                        Language language){

        var auditorium= auditoriumRepository.findById(auditoriumId).orElse(null);
        System.out.println(auditorium+"+++++++++");
        System.out.println(auditorium.getSeats()+"==========>");
        var show = new Show();
        show.setAuditorium(auditorium);
        show.setLanguage(language);
        show.setStartTime(startTime);
        show.setEndTime(endTime);
        var savedShow= showRepository.save(show);
        List<ShowSeatType> showSeatTypeList= new ArrayList<>();
        for( Seat seat : auditorium.getSeats()){

             var showSeatType = new ShowSeatType();
             showSeatType.setShow(savedShow);
            SeatType key = seat.getSeatType();
            System.out.println(key+"++"+seat);
            Integer value = seatPricing.get(key); // get price

            showSeatType.setPrice(value);
             showSeatTypeList.add(showSeatType);

        }
        savedShow.setShowSeatTypeList(showSeatTypeList);

        // adding show seats

        List<ShowSeat> showSeatList= new ArrayList<>();

        for(Seat seat: auditorium.getSeats()){

         var showSeat= new ShowSeat();
         showSeat.setSeat(seat);
         showSeat.setShow(savedShow);
         showSeat.setShowSeatStatus(ShowSeatStatus.AVAILABLE);
         showSeatList.add(showSeat);
        }

        savedShow.setShowSeats(showSeatList);

showRepository.save(savedShow);
return  savedShow;


    }
}
