package com.nildoTolentino.locadora.dto;

import com.nildoTolentino.locadora.entities.Game;
import com.nildoTolentino.locadora.projection.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public GameMinDTO() {}

	public GameMinDTO( Game gameClass) {
		id = gameClass.getId();
		titulo = gameClass.getTitulo();
		ano = gameClass.getAno();
		imgUrl = gameClass.getImgUrl();
		descricaoCurta = gameClass.getDescricaoCurta();
	}

	public GameMinDTO( GameMinProjection gameProjection) {
		id = gameProjection.getId();
		titulo = gameProjection.getTitle();
		ano = gameProjection.getGameYear();
		imgUrl = gameProjection.getImgUrl();
		descricaoCurta = gameProjection.getShortDescription();
	}
	
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	
	

}
