package com.objecoriented.bookmyshow;

import com.objecoriented.bookmyshow.controllers.CityController;
import com.objecoriented.bookmyshow.controllers.TheatreController;
import com.objecoriented.bookmyshow.controllers.UserController;
import com.objecoriented.bookmyshow.dtos.CreateUserRequestDto;
import com.objecoriented.bookmyshow.services.TheatreService;
import com.objecoriented.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;
	@Autowired
	private TheatreController theatreController;
	@Autowired
private CityController cityController;
	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) {
//		CreateUserRequestDto user = new CreateUserRequestDto("sachinksiby1236@gmail.com");
//		userController.createUser(user);
		 cityController.createCity("Kochi","https://imageUrl");
		 theatreController.createTheatre("PVR", "Edappally",1L);
		 theatreController.addAuditorium("A1", 120,1L);

	}
}
