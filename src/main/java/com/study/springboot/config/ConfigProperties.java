package com.study.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("application")
@Data
public class ConfigProperties {
	@Value("${security.user.name}")
	private String name;
	
	@Value("${security.user.password}")
	private String password;
	
	@Value("${spring.application.serviceUrl}")
	private String serviceUrl;
}
