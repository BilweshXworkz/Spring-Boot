package com.xworkz.busBookingSystem.controller;

import com.xworkz.busBookingSystem.dto.BusBookingDto;
import com.xworkz.busBookingSystem.entity.BusBookingEntity;
import com.xworkz.busBookingSystem.service.BusBookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class BusBookingController {

    private final BusBookingService service;
    BusBookingDto dto;

    public BusBookingController(BusBookingService service) {
        this.service = service;
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("save", new BusBookingDto());
        return "formgallu";
    }

    @PostMapping("/save")
    public String saveBusTicket(@ModelAttribute("save") BusBookingDto dto) {
        service.saveTicket(dto);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/fetch")
    public String  fetchBookedDetails(Model model){
        List<BusBookingEntity> details = service.getAllDetails();
        model.addAttribute("booking", details);
        return "fetch";
    }

    @GetMapping("/fetchById")
    public String editBooking(@RequestParam("Id") Integer id, Model model) {
        BusBookingEntity entity = service.getById(id);
        if (entity == null){
            return "redirect:/fetch";
        }
        BusBookingDto dto = new BusBookingDto();
        BeanUtils.copyProperties(entity, dto);
        model.addAttribute("save", dto);
        return "edit";
    }

    @GetMapping("/deleteById")
    public String deletebyId(@RequestParam("id") Integer id){
        service.deleteById(id);
        return "redirect:/fetch";
    }

    @PostMapping("/update")
    public String updateBusTicket(@ModelAttribute("save") BusBookingDto dto){
        System.out.println(dto);
        service.updateTicket(dto);
        return "redirect:/fetch";
    }
}

