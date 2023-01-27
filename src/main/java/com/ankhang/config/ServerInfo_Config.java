package com.ankhang.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerInfo_Config {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
