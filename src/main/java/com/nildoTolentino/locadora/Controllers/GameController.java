package com.nildoTolentino.locadora.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nildoTolentino.locadora.Services.GameService;
import com.nildoTolentino.locadora.dto.GameMinDTO;

@RestController
@RequestMapping(value = "/games" )
public class GameController {

@Autowired	
private GameService gameServiceInjetado;
@GetMapping
   List<GameMinDTO> listTbGameNoControler(){
	   List<GameMinDTO> result = gameServiceInjetado.listaRegsGame();
	   return result;
   }
  
}
