package com.pokestratservice.services;

import com.pokestratservice.entities.PokeStrat;

import java.util.List;

public interface PokeStratService {

    public List<PokeStrat> pokedex();

    public PokeStrat pokedex(int typeNum);

    public String addType(PokeStrat pokeStrat);

    public PokeStrat updateType(PokeStrat pokeStrat);

    public void deleteType(int parseInt);


}
