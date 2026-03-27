package com.objecoriented.bookmyshow.services;

import com.objecoriented.bookmyshow.models.*;
import com.objecoriented.bookmyshow.repositories.AuditoriumRepository;
import com.objecoriented.bookmyshow.repositories.CityRepository;
import com.objecoriented.bookmyshow.repositories.SeatRepository;
import com.objecoriented.bookmyshow.repositories.TheatreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class TheatreService {
    private TheatreRepository theatreRepository;
    private CityRepository cityRepository;
    private AuditoriumRepository auditoriumRepository;
    private SeatRepository seatRepository;
    public Theatre createTheatre(String name, String address, Long cityId){
          var theatre=  new Theatre();
          theatre.setName(name);
          theatre.setAddress(address);
          var savedTheatre= theatreRepository.save(theatre);
          var city=  cityRepository.findById(cityId).orElse(null);
          city.getTheatreList().add(savedTheatre);
           cityRepository.save(city);

return  savedTheatre;

    }

    public Auditorium addAuditorium(String name, int capacity, Long theatrId){

        var  theatre= theatreRepository.findById(theatrId).orElse(null);
        System.out.println(theatre+"+++++>");

        var auditorium= new Auditorium();
        auditorium.setName(name);
        auditorium.setCapacity(capacity);
        auditorium.setTheatre(theatre);
        var savedAuditorium= auditoriumRepository.save(auditorium);
        theatre.getAuditoriums().add(auditorium);
        theatreRepository.save(theatre);
        return auditorium;
    }
    public void addSeat(Long auditoriumId, Map<SeatType, Integer> seatCount){

       var auditorium= auditoriumRepository.findById(auditoriumId).orElse(null);
        System.out.println(auditorium+"====>");
        List<Seat> seats=new ArrayList<>();
        for(Map.Entry<SeatType, Integer> entry: seatCount.entrySet()){
          for(int i=0;i<entry.getValue();i++){
              // VIP1, VIP2, VIP3, VIP4

              Seat seat= new Seat();
              seat.setSeatNumber(entry.getKey().toString()+Integer.toString(i+1));
              seat.setSeatType(entry.getKey());
              seats.add(seat);
          }
        }
        List<Seat> savedSeats= seatRepository.saveAll(seats);
        auditorium.setSeats(savedSeats);
        auditoriumRepository.save(auditorium);

    }
}
