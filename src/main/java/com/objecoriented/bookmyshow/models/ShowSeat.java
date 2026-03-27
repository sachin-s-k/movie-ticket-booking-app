package com.objecoriented.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat  extends BaseModel{
    @ManyToOne
    Show show ;
    @ManyToOne
    Seat seat;
    @Enumerated(EnumType.STRING)
    ShowSeatStatus showSeatStatus;
}
