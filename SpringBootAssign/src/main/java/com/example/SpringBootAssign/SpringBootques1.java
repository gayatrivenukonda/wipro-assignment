package com.example.SpringBootAssign;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.ApplicationContext;

	@SpringBootApplication
	public class SpringBootques1 {

	    public static void main(String[] args) {
	        ApplicationContext context = SpringApplication.run(SpringBootques1.class, args);
	        
	        ClassKLM klm = context.getBean(ClassKLM.class);
	        klm.show();
	    }
	}

