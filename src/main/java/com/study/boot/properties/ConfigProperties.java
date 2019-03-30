package com.study.boot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Data
@Component
@ConfigurationProperties("application.spring.security.user")
public class ConfigProperties {
	@Setter
	private String name;
	
	@Setter
	private String password;
	
}
