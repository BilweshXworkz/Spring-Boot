package com.xworkz.busBookingSystem.repository;

import com.xworkz.busBookingSystem.entity.BusBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusBookingRepository extends JpaRepository<BusBookingEntity, Integer> {


}
