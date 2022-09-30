package com.pokestratservice.pokeStratDAO;

import com.pokestratservice.entities.PokeStrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokeStratDAO extends JpaRepository<PokeStrat, Integer> {
}
