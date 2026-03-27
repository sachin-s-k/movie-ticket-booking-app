package com.objecoriented.bookmyshow.controllers;

import com.objecoriented.bookmyshow.models.Auditorium;
import com.objecoriented.bookmyshow.models.SeatType;
import com.objecoriented.bookmyshow.models.Theatre;
import com.objecoriented.bookmyshow.services.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
@AllArgsConstructor
public class TheatreController {

    public TheatreService theatreService;
    public Theatre createTheatre(String name, String address, Long cityId){
        return  theatreService.createTheatre(name, address,cityId);
    }

    public Auditorium addAuditorium(String name, int capacity, Long theatreId){
 return theatreService.addAuditorium(name,capacity,theatreId);

    }
    public void addSeat(Long auditoriumId, Map<SeatType, Integer> seatCount){

    theatreService.addSeat(auditoriumId, seatCount);
    }
}
