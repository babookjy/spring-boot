package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

/*
 *   SpringBootApplication 어노테이션은 아래의 3개 어노테이션에 대한 자동설정이다.
 * 1. configuration : spring application context 구성파일이라는 명시적 어노테이션.
 * 2. EnableAutoConfiguation : spring boot의 기능을 자동설정하는 어노테이션.
 * 3. ComponentScan : 해당 Class의 패키지와 서브패키지를 자동으로 ComponentScan 설정해준다.
 * */ 
@SpringBootApplication
@Slf4j
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		/*String[] beanNames = context.getBeanDefinitionNames();
		
		for (String bean : beanNames) {
			log.info(bean);
		}*/
	}
}
