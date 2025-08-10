package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Springques2 {
	
	    public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        Account acc = (Account) context.getBean("account");
	        acc.printDetails();
	    }
	}

	


/*
 Account Number: 123456
Account Holder Name: Asha
Balance: 75000.0
Bank ID: 701, Bank Name: State Bank of India
*/