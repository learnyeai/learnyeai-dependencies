package com.learnyeai.demo.saasclient;

import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import cn.jovanyframework.cloud.saasclient.EnableSaasClient;
import cn.jovanyframework.cloud.saasclient.scene.JwtSceneService;
import cn.jovanyframework.cloud.saasclient.scene.SceneService;

@SpringBootApplication
@EnableSaasClient
@EnableDiscoveryClient
public class LearnyeaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnyeaiApplication.class, args);
	}

	@Bean
	public SceneService sceneService() throws NoSuchAlgorithmException {
		return new JwtSceneService("as466gf");
	}

}
