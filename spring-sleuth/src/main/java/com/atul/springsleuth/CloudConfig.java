package com.atul.springsleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {

	private static final Logger log = LoggerFactory.getLogger(CloudConfig.class);

	@Bean
	public AlwaysSampler defaultSampler() {
		log.info("Default config");
		return new AlwaysSampler();
	}
}
