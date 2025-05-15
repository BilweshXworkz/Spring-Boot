package com.xworkz.bikeShowroom.service;

import com.xworkz.bikeShowroom.dto.ShowroomDto;
import com.xworkz.bikeShowroom.entity.ShowroomEntity;

import java.util.List;


public interface ShowroomService {
    ShowroomEntity createShowroom(ShowroomDto dto);
    ShowroomEntity getShowroomById(Long id);
    List<ShowroomEntity> getAllShowrooms();
    ShowroomEntity updateShowroom(ShowroomEntity entity);
    void deleteShowroom(Long id);
}
