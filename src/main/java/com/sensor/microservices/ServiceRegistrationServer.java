package com.sensor.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * This class is helps to register the microservice.
 */

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {

	//1
	  public static void main(String[] args) {
	    // Tell Boot to look for registration-server.yml
	    System.setProperty("spring.config.name", "registration-server");
	    SpringApplication.run(ServiceRegistrationServer.class, args);
	  }
	}