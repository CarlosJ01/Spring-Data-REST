package com.alfacentauri.eventmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = {ApiEventManagmentApplication.class, Jsr310Converters.class}) // Clases para la hora
public class ApiEventManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEventManagmentApplication.class, args);
	}

}
