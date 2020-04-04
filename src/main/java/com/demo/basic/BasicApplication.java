package com.demo.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.demo.basic")
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

}
