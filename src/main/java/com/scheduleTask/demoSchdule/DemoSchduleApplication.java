package com.scheduleTask.demoSchdule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSchduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSchduleApplication.class, args);
	}

}
