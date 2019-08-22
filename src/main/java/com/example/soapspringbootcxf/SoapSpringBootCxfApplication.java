package com.example.soapspringbootcxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.soapspringbootcxf")
public class SoapSpringBootCxfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapSpringBootCxfApplication.class, args);
	}
}
