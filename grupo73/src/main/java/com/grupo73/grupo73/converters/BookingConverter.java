package com.grupo73.grupo73.converters;

import com.grupo73.grupo73.data.BookingData;
import com.grupo73.grupo73.entities.Booking;

public class BookingConverter extends Converter<Booking,BookingData>{

    @Override
    public Booking toEntity(BookingData object) {
        return object == null ? null : Booking.builder()
            .id(object.getId())
            .user(object.getUser())
            .room(object.getRoom())
            .date(object.getDate())
            .dateBegin(object.getDateBegin())
            .dateFinish(object.getDateFinish())
            .build();
    }

    @Override
    public BookingData toData(Booking object) {
        return object == null ? null : BookingData.builder()
            .id(object.getId())
            .user(object.getUser())
            .room(object.getRoom())
            .date(object.getDate())
            .dateBegin(object.getDateBegin())
            .dateFinish(object.getDateFinish())
            .build();
    }
    
}
