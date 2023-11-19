package com.nildoTolentino.locadora.dto;

import com.nildoTolentino.locadora.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;

	public GameListDTO() {
	}
	
	
	public GameListDTO(GameList entitGamelist) {
		id = entitGamelist.getId();
		name = entitGamelist.getName();
	}
	

	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	
	
	
}
