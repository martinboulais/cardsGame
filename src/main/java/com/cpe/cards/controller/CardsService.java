package com.cpe.cards.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpe.cards.model.Card;

@Service
public class CardsService {

	@Autowired
	private CardsRepository cardsRepository;

	public List<Card> getAllCards() {
		List<Card> cards = new ArrayList<>();
		cardsRepository.findAll().forEach(cards::add);
		return cards;
	}

	public Card getCard(String name) {
		return cardsRepository.findOne(name);
	}

	public void addCard(Card card) {
		cardsRepository.save(card);
	}

	public void updateCard(Card card) {
		cardsRepository.save(card);

	}

	public void deleteCard(String name) {
		cardsRepository.delete(name);
	}

}
