package com.francosebastian.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Franco Sebastian
 * Spring boot main class initializer
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.francosebastian.demo")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
