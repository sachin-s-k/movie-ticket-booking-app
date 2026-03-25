package com.objecoriented.bookmyshow;

import com.objecoriented.bookmyshow.controllers.UserController;
import com.objecoriented.bookmyshow.dtos.CreateUserRequestDto;
import com.objecoriented.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) {
		CreateUserRequestDto user = new CreateUserRequestDto("sachinksiby1236@gmail.com");
		userController.createUser(user);
	}
}
