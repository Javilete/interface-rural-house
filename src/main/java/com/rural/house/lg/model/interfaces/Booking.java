package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.defaults.DefaultBooking;

import java.sql.Timestamp;

@JsonDeserialize(as = DefaultBooking.class)
public interface Booking {

    public Timestamp getArrivingDate();

    public void setArrivingDate(Timestamp arrivingDate);

    public Integer getGuests();

    public void setGuests(Integer guests);

    public Integer getNights();

    public void setNights(Integer nights);
}
