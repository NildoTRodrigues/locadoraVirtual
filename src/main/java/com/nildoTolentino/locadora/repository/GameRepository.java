package com.nildoTolentino.locadora.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nildoTolentino.locadora.entities.Game;
import com.nildoTolentino.locadora.projection.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.titulo, tb_game.ano AS gameYear, tb_game.img_url AS imgUrl,
			tb_game.descricao_Curta AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);

	
}
