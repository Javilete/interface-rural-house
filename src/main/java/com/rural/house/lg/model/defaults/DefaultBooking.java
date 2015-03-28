package com.rural.house.lg.model.defaults;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rural.house.lg.model.interfaces.Booking;

import java.sql.Timestamp;

public class DefaultBooking implements Booking {

    @JsonProperty
    private Timestamp arrivingDate;

    @JsonProperty
    private Integer guests;

    @JsonProperty
    private Integer nights;

    public DefaultBooking(){

    }

    public DefaultBooking(Timestamp arrivingDate, Integer guests, Integer nigths){
        this.arrivingDate = arrivingDate;
        this.guests = guests;
        this.nights = nigths;
    }

    @Override
    public Timestamp getArrivingDate() {
        return this.arrivingDate;
    }

    @Override
    public void setArrivingDate(Timestamp arrivingDate) {
        this.arrivingDate = arrivingDate;
    }

    @Override
    public Integer getGuests() {
        return this.guests;
    }

    @Override
    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    @Override
    public Integer getNights() {
        return this.nights;
    }

    @Override
    public void setNights(Integer nights) {
        this.nights = nights;
    }
}
