package com.pokedex.services;

import com.pokedex.entities.Pokedex;
import com.pokedex.entities.Pokemon;
import com.pokedex.pokemonDao.PokemonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PokemonServiceImpl implements PokemonService{

    @Autowired
    private PokemonDAO pokemondao;

    public PokemonServiceImpl(){
    }

    @Override
    public List<Pokemon> pokedex() {
        return pokemondao.findAll();
    }

    @Override
    public Pokemon pokedex(long seq) {

        return pokemondao.findById(seq).get();
    }

    @Override
    public String addPokemon(Pokemon pokemon) {
        pokemondao.save(pokemon);
        return "{message: pokemon added successfully!}";
    }

    @Override
    public Pokemon updatePokemon(Pokemon pokemon) {
        pokemondao.save(pokemon);
        return pokemon;
    }

    @Override
    public void deletePokemon(long parseLong) {
        Pokemon pokemon = pokemondao.findById(parseLong).get();
        pokemondao.delete(pokemon);

    }
}
