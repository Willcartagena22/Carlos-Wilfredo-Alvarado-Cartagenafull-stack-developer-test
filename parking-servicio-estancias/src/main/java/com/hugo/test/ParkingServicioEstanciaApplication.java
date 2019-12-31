package com.hugo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ParkingServicioEstanciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingServicioEstanciaApplication.class, args);
	}

}
