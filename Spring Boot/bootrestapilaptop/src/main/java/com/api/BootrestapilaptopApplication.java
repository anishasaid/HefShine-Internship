package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication(scanBasePackages = "com.api.dao")
public class BootrestapilaptopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootrestapilaptopApplication.class, args);
	}

}
