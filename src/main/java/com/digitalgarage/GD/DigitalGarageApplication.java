package com.digitalgarage.GD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.access.SecurityConfig;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class DigitalGarageApplication {

	public static void main(String[] args) {

		SpringApplication.run(DigitalGarageApplication.class, args);
	}

}


