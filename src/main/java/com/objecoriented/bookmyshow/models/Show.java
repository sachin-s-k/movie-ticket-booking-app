package com.objecoriented.bookmyshow.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date StartTime;
    private  Date endTime;
    @ManyToOne
   private  Auditorium auditorium;
    @ElementCollection
    @Enumerated(EnumType.STRING)
   private List<ShowFeature> showFeatureList;
    @Enumerated(EnumType.STRING)
    private  Language language;
    @OneToMany(mappedBy="show")
    private List<ShowSeat> showSeats;
   @OneToMany
   List<ShowSeatType> showSeatTypeList;
}
