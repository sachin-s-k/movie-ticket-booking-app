package com.objecoriented.bookmyshow.services;

import com.objecoriented.bookmyshow.models.City;
import com.objecoriented.bookmyshow.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CityService {
    private CityRepository cityRepository;

    public City createCity(String name, String imageUrl){
           var city= new City();
           city.setName(name);
           city.setImageUrl(imageUrl);
      return    cityRepository.save(city);

    }
}
