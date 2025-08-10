package com.example;

	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.context.annotation.PropertySource;

	@Configuration
	@ComponentScan("com.example")
	@PropertySource("classpath:datafile.properties")
	public class SpringConfig {
	    // This class replaces AppConfig
	}


