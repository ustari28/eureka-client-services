package com.example.eurekaclientesample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClienteSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClienteSampleApplication.class, args);
	}
}
