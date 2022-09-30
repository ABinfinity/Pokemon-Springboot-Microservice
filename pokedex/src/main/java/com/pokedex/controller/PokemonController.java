package com.pokedex.controller;

import com.pokedex.entities.PokeStrat;
import com.pokedex.entities.Pokedex;
import com.pokedex.entities.Pokemon;
import com.pokedex.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/pokedex")
public class PokemonController {


    @Autowired
    private PokemonService pokemonService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @GetMapping("/all")
    public List<Pokemon> getPokemon(){
        return this.pokemonService.pokedex();
    }

    @GetMapping("/pokemon/{seq}")
    public Pokedex getPokemon(@PathVariable("seq") String seq){
        Pokedex pokedex = new Pokedex();
        Pokemon pokemon = this.pokemonService.pokedex(Long.parseLong(seq));
        PokeStrat pokestrat = this.restTemplate.getForObject("http://pokeStrat/pokedex/type/"+ pokemon.getTypeNum(), PokeStrat.class);
        pokedex.setPokemon(pokemon);
        pokedex.setStrategy(pokestrat);
        return pokedex;
    }

    @PostMapping("/pokemon")
    public String addPokemon(@RequestBody Pokemon pokemon){
        return this.pokemonService.addPokemon(pokemon);
    }

    @PutMapping("/pokemon")
    public Pokemon updatePokemon(@RequestBody Pokemon pokemon){
        return this.pokemonService.updatePokemon(pokemon);
    }

    @DeleteMapping("/pokemon/{seq}")
    public ResponseEntity<HttpStatus> deletePokemon(@PathVariable("seq") String seq){
        try{
            this.pokemonService.deletePokemon(Long.parseLong(seq));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
