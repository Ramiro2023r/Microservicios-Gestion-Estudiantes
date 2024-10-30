package com.gesti.orquestadorgesti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrquestadorGestiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrquestadorGestiApplication.class, args);
	}

}
