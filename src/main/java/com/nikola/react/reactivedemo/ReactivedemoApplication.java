package com.nikola.react.reactivedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ReactivedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactivedemoApplication.class, args);
	}

}
