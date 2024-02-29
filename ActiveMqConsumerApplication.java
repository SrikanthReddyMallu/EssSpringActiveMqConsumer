package com.example.ActiveMqConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ActiveMqConsumer.*")
public class ActiveMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMqConsumerApplication.class, args);
	}

}
