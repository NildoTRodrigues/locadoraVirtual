package com.nildoTolentino.locadora.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nildoTolentino.locadora.dto.GameListDTO;
import com.nildoTolentino.locadora.repository.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository injetaTbGamesList;

		
	@Transactional(readOnly = true)
	public List<GameListDTO> servlistaGame() {
		var result = injetaTbGamesList.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
}
