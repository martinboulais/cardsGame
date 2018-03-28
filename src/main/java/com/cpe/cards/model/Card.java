package com.cpe.cards.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String description;
	
	private String Family;
	
	private Integer hp;
	
	private Integer attack;
	
	private Integer defence;
	
	private Integer energy;
	
	private String imgUrl;
	
	public Card(String name, String description, String family, Integer hp, Integer attack, Integer defence,
			Integer energy, String imgUrl) {
		super();
		this.name = name;
		this.description = description;
		Family = family;
		this.hp = hp;
		this.attack = attack;
		this.defence = defence;
		this.energy = energy;
		this.imgUrl = imgUrl;
	}

	public Card()
	{
		this("", "", "", 0, 0, 0, 0, "");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFamily() {
		return Family;
	}

	public void setFamily(String family) {
		Family = family;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefence() {
		return defence;
	}

	public void setDefence(Integer defence) {
		this.defence = defence;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
}
