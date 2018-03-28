package com.cpe.cards.controller;

import org.springframework.data.repository.CrudRepository;

import com.cpe.cards.model.Card;

public interface CardsRepository extends CrudRepository<Card, String> {

	public Card findOne(String name);
	

}
