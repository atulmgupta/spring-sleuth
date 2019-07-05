package com.atul.springzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SpringZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZipkinServerApplication.class, args);
	}

}
