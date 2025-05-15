package com.xworkz.bikeShowroom.controller;

import com.xworkz.bikeShowroom.dto.ShowroomDto;
import com.xworkz.bikeShowroom.entity.ShowroomEntity;
import com.xworkz.bikeShowroom.service.ShowroomService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/showrooms")
public class ShowroomController {

    @Autowired
    ShowroomService service;

    @PostMapping("/save")
    public ResponseEntity<String> createShowroom(@RequestBody ShowroomDto dto) {
        service.createShowroom(dto);
        return ResponseEntity.ok("showroom added successfully");
    }

    @GetMapping("{id}")
    public ResponseEntity<ShowroomEntity> getShowroomById(@PathVariable("id") Long id) {
        ShowroomEntity entity = service.getShowroomById(id);
        if (entity != null) {
            return new ResponseEntity<>(entity, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<ShowroomEntity>> getAllShowroom() {
        List<ShowroomEntity> entity = service.getAllShowrooms();
        return new ResponseEntity<>(entity,HttpStatus.OK);
    }

    @PutMapping("{id}")
    public  ResponseEntity<ShowroomEntity> updateShowroom(@PathVariable("id") Long id,
                                                          @RequestBody ShowroomEntity entity) {
        entity.setId(id);
        ShowroomEntity entity1 = service.updateShowroom(entity);
        return new ResponseEntity<>(entity1, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String > deleteShowroom(@PathVariable("id") Long id) {
        service.deleteShowroom(id);
        return new ResponseEntity<>("User successfull deleted!", HttpStatus.OK);
    }
}
