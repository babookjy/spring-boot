package com.study.boot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCkeck {

	@GetMapping("/health")
	public String getHealth() {
		return "ok";
	}
}
