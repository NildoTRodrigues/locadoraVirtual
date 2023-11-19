package com.nildoTolentino.locadora.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nildoTolentino.locadora.Services.GameListService;
import com.nildoTolentino.locadora.Services.GameService;
import com.nildoTolentino.locadora.dto.GameListDTO;
import com.nildoTolentino.locadora.dto.GameMinDTO;

@RestController
@RequestMapping(value = "/lists" )
public class GameListController {

@Autowired	
private GameListService gameListServiceInjetado;
@Autowired	
private GameService gameServiceInjetado;       


@GetMapping
   List<GameListDTO> listTbGameListNoControler(){
	   List<GameListDTO> result = gameListServiceInjetado.servlistaGame();
	   return result;
   }


@GetMapping(value = "/{listId}/games")
public List<GameMinDTO> findByList(@PathVariable Long listId){
	   List<GameMinDTO> result = gameServiceInjetado.listaRegsGame();
	   return result;
}

}
