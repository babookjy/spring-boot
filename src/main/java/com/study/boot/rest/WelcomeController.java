package com.study.boot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Value("${security.user-name}")
	String userName;

	@GetMapping("/welcome")
	public String getWelcome() {
		return "Hello Worldsss";
	}
	
	@GetMapping("/welcome-object")
	public Welcome getWelcomeObject() {
		return new Welcome("Hello World");
	}
}
