package com.eserver.pokemoneserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PokemonEServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonEServerApplication.class, args);
    }

}
