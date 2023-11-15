package com.nildoTolentino.locadora.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nildoTolentino.locadora.dto.GameMinDTO;
import com.nildoTolentino.locadora.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository injetaTbGames;

	public List<GameMinDTO> listaRegsGame() {
		var result = injetaTbGames.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	}
	
}
