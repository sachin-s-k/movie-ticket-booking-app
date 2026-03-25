package com.objecoriented.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Payment extends BaseModel{
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    private Date  timeOfPayment;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private double amount;

    private PaymentMethod paymentMethod;

}

// 1 : 1,  M <--1