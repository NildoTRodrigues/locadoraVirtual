package com.nildoTolentino.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nildoTolentino.locadora.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
