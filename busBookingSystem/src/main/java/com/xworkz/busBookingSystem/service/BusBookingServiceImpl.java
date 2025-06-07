package com.xworkz.busBookingSystem.service;

import com.xworkz.busBookingSystem.dto.BusBookingDto;
import com.xworkz.busBookingSystem.entity.BusBookingEntity;
import com.xworkz.busBookingSystem.repository.BusBookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BusBookingServiceImpl implements BusBookingService{

    BusBookingRepository repository;

    @Override
    public BusBookingEntity saveTicket(BusBookingDto dto) {
        BusBookingEntity entity = new BusBookingEntity();
        BeanUtils.copyProperties(dto, entity);
        return repository.save(entity);
    }

    @Override
    public List<BusBookingEntity> getAllDetails() {
        return repository.findAll();
    }

    @Override
    public BusBookingEntity getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public BusBookingEntity updateTicket(BusBookingDto dto) {
        Optional<BusBookingEntity> optional = repository.findById(dto.getId());
        if(optional.isPresent()) {
            BusBookingEntity entity = optional.get();

            entity.setName(dto.getName());
            entity.setPickUp(dto.getPickUp());
            entity.setDropLocation(dto.getDropLocation());
            entity.setTicketPrice(dto.getTicketPrice());

            return repository.save(entity);
        }
        return null;
    }
}
