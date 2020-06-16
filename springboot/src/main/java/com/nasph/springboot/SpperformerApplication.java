package com.nasph.springboot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpperformerApplication {

	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpperformerApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "7780"));
		app.run(args);
		
		//docker run -p 80:80 skalena/spperformer:latest
	}

}
