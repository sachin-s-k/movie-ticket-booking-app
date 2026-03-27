package com.objecoriented.bookmyshow.controllers;

import com.objecoriented.bookmyshow.models.Language;
import com.objecoriented.bookmyshow.models.SeatType;
import com.objecoriented.bookmyshow.models.Show;
import com.objecoriented.bookmyshow.services.ShowService;
import lombok.AllArgsConstructor;
import org.hibernate.type.SetType;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Map;

@Controller
@AllArgsConstructor
public class ShowController {
    private final ShowService showService;

    public Show addShow(Long auditoriumId, Date startTime,
                        Date endTime,
                        Long movieId,
                        Map<SeatType, Integer> seatPricing,
                        Language language
                        ){
        return showService.addShow(auditoriumId,startTime,endTime, movieId, seatPricing,language);


    }

}
