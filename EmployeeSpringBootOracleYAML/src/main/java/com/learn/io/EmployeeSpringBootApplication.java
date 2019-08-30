package com.learn.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement
public class EmployeeSpringBootApplication implements CommandLineRunner{

    @Autowired
	private YamlConfig myConfig;
	   
	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringBootApplication.class, args);
		
		//Create Table in oracle as per the Entity
		//Comment Auto Generation 
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		 System.out.println("using environment:" + myConfig.getEnvironment());
	        System.out.println("name:" + myConfig.getName());
	        System.out.println("servers:" + myConfig.getServers());
		
	}

}
