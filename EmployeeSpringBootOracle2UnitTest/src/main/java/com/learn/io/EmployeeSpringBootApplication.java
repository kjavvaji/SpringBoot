package com.learn.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement
public class EmployeeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringBootApplication.class, args);
		
		//Create Table in oracle as per the Entity
		//Comment Auto Generation 
		
	}

}
