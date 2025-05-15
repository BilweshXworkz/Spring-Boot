package com.xworkz.bikeShowroom.service;


import com.xworkz.bikeShowroom.dto.ShowroomDto;
import com.xworkz.bikeShowroom.entity.ShowroomEntity;
import com.xworkz.bikeShowroom.repository.ShowroomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ShowroomServiceImpl  implements ShowroomService{

    @Autowired
    private ShowroomRepository repository;

    @Transactional
    @Override
    public ShowroomEntity createShowroom(ShowroomDto dto) {
        System.out.println("===== Saving Showroom =====");
        System.out.println("Name     : " + dto.getShowroomName());
        System.out.println("Location : " + dto.getShowroomLocation());
        System.out.println("Contact  : " + dto.getContact());
        System.out.println("Email    : " + dto.getEmail());
        ShowroomEntity entity = new ShowroomEntity();
        BeanUtils.copyProperties(dto, entity);
        return repository.save(entity);
    }

    @Override
    public ShowroomEntity getShowroomById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<ShowroomEntity> getAllShowrooms() {
        return repository.findAll();
    }

    @Transactional
    @Override
    public ShowroomEntity updateShowroom(ShowroomEntity entity) {
        ShowroomEntity entity1 = repository.findById(entity.getId()).get();
        entity1.setShowroomName(entity.getShowroomName());
        entity1.setShowroomLocation(entity.getShowroomLocation());
        entity1.setContact(entity.getContact());
        entity1.setEmail(entity.getEmail());
        ShowroomEntity update = repository.save(entity1);
        return update;
    }

    @Override
    public void deleteShowroom(Long id) {
        repository.deleteById(id);
    }
}