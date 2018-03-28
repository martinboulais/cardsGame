package com.cpe.cards.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Possession {

	@EmbeddedId
	private PossessionIdentity possessionIdentity;

	public Possession(@NotNull Integer id_card, @NotNull Integer id_user)
	{
		super();
		this.possessionIdentity = new PossessionIdentity(id_card, id_user);
	}
	
	public Possession()
	{
		super();
		
		this.possessionIdentity = new PossessionIdentity();
	}
	
}
