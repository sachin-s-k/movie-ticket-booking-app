package com.objecoriented.bookmyshow.controllers;

import com.objecoriented.bookmyshow.models.Theatre;
import com.objecoriented.bookmyshow.services.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class TheatreController {

    public TheatreService theatreService;
    public Theatre createTheatre(String name, String address, Long cityId){
        return  theatreService.createTheatre(name, address,cityId);
    }
}
