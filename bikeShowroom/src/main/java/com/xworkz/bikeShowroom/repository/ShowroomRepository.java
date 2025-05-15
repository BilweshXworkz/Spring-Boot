package com.xworkz.bikeShowroom.repository;

import com.xworkz.bikeShowroom.entity.ShowroomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowroomRepository extends JpaRepository<ShowroomEntity, Long> {}
