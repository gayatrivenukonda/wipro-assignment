package com.example;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

	

	@Configuration
	@ComponentScan(basePackages = "com.example") // Scans the same package
	public class AppConfig {
	}

