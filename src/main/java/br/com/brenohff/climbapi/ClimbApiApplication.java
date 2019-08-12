package br.com.brenohff.climbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class ClimbApiApplication extends SpringServletContainerInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ClimbApiApplication.class, args);
	}

}
