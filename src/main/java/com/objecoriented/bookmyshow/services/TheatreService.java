package com.objecoriented.bookmyshow.services;

import com.objecoriented.bookmyshow.models.City;
import com.objecoriented.bookmyshow.models.Theatre;
import com.objecoriented.bookmyshow.repositories.CityRepository;
import com.objecoriented.bookmyshow.repositories.TheatreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TheatreService {
    private TheatreRepository theatreRepository;
    private CityRepository cityRepository;
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
}
