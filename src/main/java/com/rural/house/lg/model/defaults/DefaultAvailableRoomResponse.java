package com.rural.house.lg.model.defaults;

import com.rural.house.lg.model.RoomType;
import com.rural.house.lg.model.interfaces.AvailableRoomResponse;

import java.sql.Timestamp;
import java.util.List;

public class DefaultAvailableRoomResponse implements AvailableRoomResponse {

    private RoomType roomType;

    private List<Timestamp> dateList;

    private Integer guests;

    public DefaultAvailableRoomResponse() {

    }

    public DefaultAvailableRoomResponse(RoomType roomType, List<Timestamp> dateList, Integer guests){
        this.roomType = roomType;
        this.dateList = dateList;
        this.guests = guests;
    }

    @Override
    public RoomType getType() {
        return this.roomType;
    }

    @Override
    public void setType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public List<Timestamp> getDateList() {
        return this.dateList;
    }

    @Override
    public void setDateList(List<Timestamp> dateList) {
        this.dateList = dateList;
    }

    @Override
    public Integer getGuests() {
        return this.guests;
    }

    @Override
    public void setGuests(Integer guests) {
        this.guests = guests;
    }
}
