package com.nasph.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RestApp {

	private static final String template = "Ping, %s!";
    private static final Logger LOG = LoggerFactory.getLogger(RestApp.class);	

	@GetMapping("/ping")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		LOG.info("SpringBoot: "  + template, name);
        return String.format("SpringBoot: "  + template, name);
	}    
    
}