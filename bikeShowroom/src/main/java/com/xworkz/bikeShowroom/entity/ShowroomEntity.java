package com.xworkz.bikeShowroom.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table (name = "showroom")

public class ShowroomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;
    @Column (name = "showroom_name")
    private String showroomName;
    @Column (name = "showroom_location")
    private String showroomLocation;
    @Column (name = "contact")
    private Long contact;
    @Column (name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
