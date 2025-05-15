package com.xworkz.bikeShowroom.dto;

import lombok.*;

@Data
@Getter
@Setter

public class ShowroomDto {
    private String showroomName;
    private String showroomLocation;
    private Long contact;
    private String email;


    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public  String getShowroomLocation() {
        return showroomLocation;
    }

    public void setShowroomLocation(String showroomLocation) {
        this.showroomLocation = showroomLocation;
    }


    public Long getContact() {
        return contact;
    }

    public void setContact (Long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
