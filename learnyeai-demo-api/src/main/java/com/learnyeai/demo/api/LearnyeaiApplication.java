package com.learnyeai.demo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.learnyeai.demo.saas.client.openfeign.EnableFeignSaaSClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignSaaSClient
public class LearnyeaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnyeaiApplication.class, args);
	}

}
