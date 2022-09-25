package com.grupo73.grupo73.data;

import java.util.Date;

import com.grupo73.grupo73.entities.Room;
import com.grupo73.grupo73.entities.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingData {
    
    private int id;
    private User user;
    private Room room;
    private Date date;
    private Date dateBegin;
    private Date dateFinish;
    
}
