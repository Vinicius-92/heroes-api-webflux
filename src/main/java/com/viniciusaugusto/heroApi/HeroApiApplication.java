package com.viniciusaugusto.heroApi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroApiApplication.class, args);
		System.out.println("Super powers with Webflux");
	}

}
