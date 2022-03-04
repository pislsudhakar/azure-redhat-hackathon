package com.aro.handlingformsubmission;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandlingFormSubmissionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HandlingFormSubmissionApplication.class, args);
	}
	
	@Value(value = "${spring.envType}")
	String envType;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("******************"+envType+"************************");
	}
}
