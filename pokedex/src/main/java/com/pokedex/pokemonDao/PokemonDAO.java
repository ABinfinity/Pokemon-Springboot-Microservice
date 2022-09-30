package com.pokedex.pokemonDao;

import com.pokedex.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonDAO extends JpaRepository<Pokemon, Long> {
}
