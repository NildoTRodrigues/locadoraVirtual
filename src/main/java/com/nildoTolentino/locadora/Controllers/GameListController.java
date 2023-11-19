package com.nildoTolentino.locadora.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nildoTolentino.locadora.Services.GameListService;
import com.nildoTolentino.locadora.dto.GameListDTO;

@RestController
@RequestMapping(value = "/lists" )
public class GameListController {

@Autowired	
private GameListService gameListServiceInjetado;


@GetMapping
   List<GameListDTO> listTbGameListNoControler(){
	   List<GameListDTO> result = gameListServiceInjetado.servlistaGame();
	   return result;
   }
  
}
