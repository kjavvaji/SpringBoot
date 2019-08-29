package com.learn.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	//Using JPA Repo 
	//Optional Type to handle nulls
	//need xml dependency to support for xml format 
	//to restrict the format then use path="",produces={applicatio/xml}
	//REST===Controller
	//POST===mapping
	//Get mapping
	//Testing
	
}
