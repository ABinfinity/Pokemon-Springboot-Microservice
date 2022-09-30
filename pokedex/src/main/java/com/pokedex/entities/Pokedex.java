package com.pokedex.entities;

public class Pokedex {
    private Pokemon pokemon;
    private PokeStrat strategy;

    public Pokedex() {
        super();
    }

    public Pokedex(Pokemon pokemon, PokeStrat strategy) {
        this.pokemon = pokemon;
        this.strategy = strategy;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public PokeStrat getStrategy() {
        return strategy;
    }

    public void setStrategy(PokeStrat strategy) {
        this.strategy = strategy;
    }
}
