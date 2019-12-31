package com.hugo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ParkingServicioVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingServicioVehiculosApplication.class, args);
	}

}
