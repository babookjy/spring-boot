package com.study.boot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController는 @Controller 어노테이션과 @ResponseBody 어노테이션이 함께 제공되는 어노테이션이다.
 * ResponseBody 어노테이션은 Ajax와 RestAPI로 데이터 전송 시 사용되는 어노테이션으로 Template 을 제외한 순수 Body 데이터만 주고 받을때 사용한다.
 * */
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
