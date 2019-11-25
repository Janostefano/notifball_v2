package com.notifball.notifball;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
@EnableEncryptableProperties
public class NotifballApplication {
	public static void main(String[] args) {
		SpringApplication.run(NotifballApplication.class, args);
	}
}
