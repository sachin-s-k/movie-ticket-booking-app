package com.objecoriented.bookmyshow.controllers;

import com.objecoriented.bookmyshow.models.City;
import com.objecoriented.bookmyshow.services.CityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CityController {

    private CityService cityService;
    public City createCity(String name, String imageUrl){
      return cityService.createCity(name,imageUrl);
    };




}
