package com.pokedex.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
public class Pokemon {
    public int getTypeMap(String key) {
        HashMap<String, Integer> typeMap = new HashMap<>();

        typeMap.put("grass", 100);
        typeMap.put("fire", 102);
        typeMap.put("water", 101);
        typeMap.put("electric",103);
        typeMap.put("rock", 104);

        return typeMap.get(key);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;
    private String name;
    private float heightInCMS;
    private float weightInKGS;
    private String category;
    private String abilities;
    private String type;
    private int typeNum;

    public Pokemon() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon(long seq, String name, float heightInCMS, float weightInKGS, String category, String abilities, String type, int typeNum) {
        super();
        this.seq = seq;
        this.name = name;
        this.heightInCMS = heightInCMS;
        this.weightInKGS = weightInKGS;
        this.category = category;
        this.abilities = abilities;
        this.type = type;
        this.typeNum = typeNum;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public float getHeightInCMS() {
        return heightInCMS;
    }

    public void setHeightInCMS(float heightInCMS) {
        this.heightInCMS = heightInCMS;
    }

    public float getWeightInKGS() {
        return weightInKGS;
    }

    public void setWeightInKGS(float weightInKGS) {
        this.weightInKGS = weightInKGS;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "seq=" + seq +
                ", name='" + name + '\'' +
                ", heightInCMS=" + heightInCMS +
                ", weightInKGS=" + weightInKGS +
                ", category='" + category + '\'' +
                ", abilities='" + abilities + '\'' +
                ", type='" + type + '\'' +
                ", typeNum='" + typeNum + '\'' +
                '}';
    }
}
