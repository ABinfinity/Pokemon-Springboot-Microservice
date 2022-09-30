package com.pokestratservice.controller;

import com.pokestratservice.entities.PokeStrat;
import com.pokestratservice.services.PokeStratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokeStrat")
public class PokeStratController {

    @Autowired
    private PokeStratService pokeStratService;

    @GetMapping("/home")
    public String home(){
        return "This is the home page";
    }

    @GetMapping("/alltype")
    public List<PokeStrat> getType(){
        return this.pokeStratService.pokedex();
    }

    @GetMapping("/type/{typeNum}")
    public PokeStrat getType(@PathVariable("typeNum") String typeNum){
        return this.pokeStratService.pokedex(Integer.parseInt(typeNum));
    }

    @PostMapping("/type")
    public String getType(@RequestBody PokeStrat pokestrat){
        return this.pokeStratService.addType(pokestrat);
    }

    @PutMapping("/type")
    public PokeStrat updateType(@RequestBody PokeStrat pokestrat){
        return this.pokeStratService.updateType(pokestrat);
    }

    @DeleteMapping("/type/{typeNum}")
    public ResponseEntity<HttpStatus> deleteType(@PathVariable("typeNum") String typeNum){
        try{
            this.pokeStratService.deleteType(Integer.parseInt(typeNum));
            return new ResponseEntity<>(HttpStatus.OK);

        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }


}
