package com.atul.springsleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class SpringSleuthApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringSleuthApplication.class);

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringSleuthApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		log.info("Welome Here");
		return "Welcome here";
	}

	@GetMapping("/welcome")
	public String welcome2() {
		log.info("Welome Here");
		return this.restTemplate.getForObject("http://localhost:9012/", String.class);
	}

}
