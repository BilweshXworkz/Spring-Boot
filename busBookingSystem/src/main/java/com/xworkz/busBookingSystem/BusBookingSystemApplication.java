package com.xworkz.busBookingSystem;


import com.xworkz.busBookingSystem.dto.BusBookingDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusBookingSystemApplication.class, args);

		BusBookingDto busBookingDto=new BusBookingDto();
		busBookingDto.setName("Myname");
		System.out.println("MY name :"+busBookingDto.getName());
	}

}
