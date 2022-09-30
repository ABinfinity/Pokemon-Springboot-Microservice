package com.pokemongateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PokemonGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonGatewayApplication.class, args);
	}

}
