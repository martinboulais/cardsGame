package com.cpe.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cpe.cards.model.Card;

@RestController
public class CardsRestController {
	
	@Autowired
	private CardsService CardsService;
	
	@RequestMapping("/test")
	private String test() {
		return "test";

	}
	
	@RequestMapping("/cards")
	private List<Card> getAllCards() {
		return CardsService.getAllCards();

	}
	
	@RequestMapping("/card/{name}")
	private Card getCard(@PathVariable String name) {
		return CardsService.getCard(name);

	}
	
	@RequestMapping(method=RequestMethod.POST,value="/cards")
	public void addCard(@RequestBody Card card) {
		CardsService.addCard(card);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/update_card/{name}")
	public void updateCard(@RequestBody Card card,@PathVariable String name) {
		card.setName(name);
		CardsService.updateCard(card);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete_card/{name}")
	public void deleteCard(@PathVariable String name) {
		CardsService.deleteCard(name);
	}
	

}
