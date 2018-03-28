package com.cpe.cards.controller;

import org.springframework.data.repository.CrudRepository;

import com.cpe.cards.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
