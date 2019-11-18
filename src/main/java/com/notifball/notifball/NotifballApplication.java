package com.notifball.notifball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class NotifballApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifballApplication.class, args);
	}

}
