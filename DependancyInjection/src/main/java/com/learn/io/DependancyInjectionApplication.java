package com.learn.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependancyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependancyInjectionApplication.class, args);
		
		Alien a1 =context.getBean(Alien.class);
		a1.show();

//		Alien a2 =context.getBean(Alien.class);
//		a2.show();
		
		// Old Tight Coupling process
//		Alien a = new Alien();
//		//a.setAid(1);
//		//System.out.println(a.getAid());
	}

}
