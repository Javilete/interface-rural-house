package com.rural.house.lg.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rural.house.lg.model.RoomType;
import com.rural.house.lg.model.defaults.DefaultAvailableRoomResponse;

import java.sql.Timestamp;
import java.util.List;

@JsonDeserialize(as = DefaultAvailableRoomResponse.class)
public interface AvailableRoomResponse {

    public RoomType getType();

    public void setType(RoomType roomType);

    public List<Timestamp> getDateList();

    public void setDateList(List<Timestamp> dateList);

    public Integer getGuests();

    public void setGuests(Integer guests);
}
