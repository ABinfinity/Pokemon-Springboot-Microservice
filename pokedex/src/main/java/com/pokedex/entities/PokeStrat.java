package com.pokedex.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class PokeStrat {
    private int typeNum;
    private String type;
    private String strength;
    private String weakness;

    public int getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public PokeStrat() {
        super();
    }

    public PokeStrat(int typeNum, String type, String strength, String weakness) {
        this.typeNum = typeNum;
        this.type = type;
        this.strength = strength;
        this.weakness = weakness;
    }

    @Override
    public String toString() {
        return "PokeStrat{" +
                "typeNum=" + typeNum +
                ", type='" + type + '\'' +
                ", strength='" + strength + '\'' +
                ", weakness='" + weakness + '\'' +
                '}';
    }
}
