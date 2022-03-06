package com.edusol.jobscheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class JobschedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobschedulingApplication.class, args);
	}

	@Scheduled(cron = "0 48 20 * * ? ", zone = "IST")
	public void mySchedular() {
		System.out.println("schedular started");
	}

}
