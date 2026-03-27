package com.objecoriented.bookmyshow;

import com.objecoriented.bookmyshow.controllers.*;
import com.objecoriented.bookmyshow.dtos.CreateUserRequestDto;
import com.objecoriented.bookmyshow.models.Language;
import com.objecoriented.bookmyshow.models.SeatType;
import com.objecoriented.bookmyshow.services.TheatreService;
import com.objecoriented.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;
	@Autowired
	private TheatreController theatreController;
	@Autowired
private CityController cityController;

	@Autowired
	private ShowController showController;
	@Autowired
	private TicketController ticketController;
	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) {
//		CreateUserRequestDto user = new CreateUserRequestDto("sachinksiby1236@gmail.com");
//		userController.createUser(user);
//		 cityController.createCity("Kochi","https://imageUrl");
//		 theatreController.createTheatre("PVR", "Edappally",1L);
//		 theatreController.addAuditorium("A1", 120,1L);
//		Map<SeatType,Integer> seatCount= new HashMap<>();
//		seatCount.put(SeatType.GOLD,40);
//		seatCount.put(SeatType.PLATINUM,40);
//		seatCount.put(SeatType.SILVER,40);
//
//
//        theatreController.addSeat(1L,seatCount)
//        ;
//
//		Map<SeatType, Integer> seatPricing = new HashMap<>();
//		seatPricing.put(SeatType.GOLD, 500);
//		seatPricing.put(SeatType.SILVER, 200);
//		seatPricing.put(SeatType.PLATINUM, 300);
//
//		showController.addShow(
//				1L,
//				new Date(),
//				new Date(),
//				2L,
//				seatPricing,
//				Language.ENGLISH
//		);

//		ticketController.bookTicket(1L, List.of(1L,2L,3L),1L);
		TicketBookRunner ticketBookRunner1 = new TicketBookRunner(
				this.ticketController,
				3L,
				List.of(58L, 59L, 60L),
				1L
		);

		TicketBookRunner ticketBookRunner2 = new TicketBookRunner(
				this.ticketController,
				3L,
				List.of(60L, 61L, 62L),
				1L
		);
		Thread t1= new Thread(ticketBookRunner1);
		Thread t2= new Thread(ticketBookRunner2);
		t1.start();
		t2.start();
	}
}
