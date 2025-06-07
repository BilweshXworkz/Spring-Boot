package com.xworkz.busBookingSystem.service;

import com.xworkz.busBookingSystem.dto.BusBookingDto;
import com.xworkz.busBookingSystem.entity.BusBookingEntity;

import java.util.List;

public interface BusBookingService {
    BusBookingEntity saveTicket(BusBookingDto dto);
    List<BusBookingEntity> getAllDetails();
    BusBookingEntity getById(Integer id);
    void deleteById(Integer id);
    BusBookingEntity  updateTicket(BusBookingDto dto);
}
