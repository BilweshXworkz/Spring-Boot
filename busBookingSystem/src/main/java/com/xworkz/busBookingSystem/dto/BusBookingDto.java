package com.xworkz.busBookingSystem.dto;


import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Component

public class BusBookingDto {
    private Integer id;
    private String name;
    private String pickUp;
    private String dropLocation;
    private Double ticketPrice;

}
