package com.example;


	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class Springques1 {
	    public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	        CredentialService service = context.getBean(CredentialService.class);
	        service.displayCredentials();
	    }
	}


/*
 URL: http://gmail.com
Username: mural
Password: 1234
 */
	