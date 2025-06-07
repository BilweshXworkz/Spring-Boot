package com.xworkz.busBookingSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bus_info")
public class BusBookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "pick_up")
    private String pickUp;

    @Column(name = "drop_location")
    private String dropLocation;

    @Column(name = "ticket_price")
    private Double ticketPrice;
}
