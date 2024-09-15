package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}

//Controlador REST
@RestController
@RequestMapping("/api")
class MyController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!!!!";
	}

	@GetMapping("/greet")
	public String greetUser(String name) {
		return "Hello, " + (name != null ? name : "Guest") + "!";
	}
}