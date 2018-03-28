package com.cpe.cards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cpe.cards.controller.CardsRepository;
import com.cpe.cards.controller.UserRepository;

@SpringBootApplication
public class CardsApplication {

	@Autowired
    private CardsRepository cardRepository;

    @Autowired
    private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
