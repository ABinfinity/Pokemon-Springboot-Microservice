package com.pokedex.services;

import com.pokedex.entities.Pokedex;
import com.pokedex.entities.Pokemon;

import java.util.List;


public interface PokemonService {

    public List<Pokemon> pokedex();

    public Pokemon pokedex(long seq);

    public String addPokemon(Pokemon pokemon);

    public Pokemon updatePokemon(Pokemon pokemon);

    public void deletePokemon(long parseLong);
}
