package com.example.myJavaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MyJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJavaDemoApplication.class, args);
	}

}
