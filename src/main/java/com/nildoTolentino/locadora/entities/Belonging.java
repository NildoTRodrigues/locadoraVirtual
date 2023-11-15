package com.nildoTolentino.locadora.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_belonging")
public class Belonging {
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer posicion;
	

	public Belonging() {}


	public Belonging(Game game, GameList list, Integer posicion) {
		id.setGame(game);
		id.setList(list);
				
		this.posicion = posicion;
	}
	
	
	
	
}