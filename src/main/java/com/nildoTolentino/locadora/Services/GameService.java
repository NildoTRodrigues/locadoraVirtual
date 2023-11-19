package com.nildoTolentino.locadora.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nildoTolentino.locadora.dto.GameDTO;
import com.nildoTolentino.locadora.dto.GameMinDTO;
import com.nildoTolentino.locadora.entities.Game;
import com.nildoTolentino.locadora.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository injetaTbGames;

	@Transactional(readOnly = true)
	public GameDTO listaPorID(Long gameId) {
		Game result = injetaTbGames.findById(gameId).get();
		GameDTO dto = new GameDTO(result) ;
		return dto;
				
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> listaRegsGame() {
		var result = injetaTbGames.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
	}
	
}
