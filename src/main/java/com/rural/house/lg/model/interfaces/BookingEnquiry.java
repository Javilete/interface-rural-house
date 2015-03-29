package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.defaults.DefaultBookingEnquiry;

import java.sql.Timestamp;

@JsonDeserialize(as = DefaultBookingEnquiry.class)
public interface BookingEnquiry {

    public Timestamp getArrivingDate();

    public void setArrivingDate(Timestamp arrivingDate);

    public Integer getGuests();

    public void setGuests(Integer guests);

    public Integer getNights();

    public void setNights(Integer nights);
}
