package com.pokestratservice.services;

import com.pokestratservice.entities.PokeStrat;
import com.pokestratservice.pokeStratDAO.PokeStratDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PokeStratServiceImpl implements PokeStratService{

    @Autowired
    private PokeStratDAO pokeStratDAO;

    public PokeStratServiceImpl() {
    }

    @Override
    public List<PokeStrat> pokedex() {
        return pokeStratDAO.findAll();
    }

    @Override
    public PokeStrat pokedex(int typeNum) {
        return pokeStratDAO.findById(typeNum).get();
    }

    @Override
    public String addType(PokeStrat pokeStrat) {
        pokeStratDAO.save(pokeStrat);
        return "{message: type added successfully!}";
    }

    @Override
    public PokeStrat updateType(PokeStrat pokeStrat) {
        pokeStratDAO.save(pokeStrat);
        return pokeStrat;
    }

    @Override
    public void deleteType(int typeNum) {
        PokeStrat pokeStrat = pokeStratDAO.findById(typeNum).get();
        pokeStratDAO.delete(pokeStrat);

    }
}
