package com.example.stline;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class StLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(StLineApplication.class, args);
	}

}
