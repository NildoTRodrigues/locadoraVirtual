package com.nildoTolentino.locadora.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nildoTolentino.locadora.dto.GameDTO;
import com.nildoTolentino.locadora.dto.GameMinDTO;
import com.nildoTolentino.locadora.entities.Game;
import com.nildoTolentino.locadora.projection.GameMinProjection;
import com.nildoTolentino.locadora.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository injetaTbGames;

	@Transactional(readOnly = true)
	public GameDTO listaPorID(Long gameId) {
		Game result = injetaTbGames.findById(gameId).get();
		return new GameDTO(result) ;
				
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> listaRegsGame() {
		var result = injetaTbGames.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> procuraNaListaGamex( Long listId ) {
		List<GameMinProjection> result = injetaTbGames.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	
}
