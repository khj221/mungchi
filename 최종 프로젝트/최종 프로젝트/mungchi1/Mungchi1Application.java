package com.example.mungchi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Mungchi1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mungchi1Application.class, args);
	}

}
