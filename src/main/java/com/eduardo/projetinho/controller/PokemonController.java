package com.eduardo.projetinho.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardo.projetinho.model.Pokemon;
import com.eduardo.projetinho.services.PokemonServices;

@RestController
@RequestMapping(value = "/pokemons")
public class PokemonController {
	
	@Autowired
	private PokemonServices service;
	
	@GetMapping
	public List<Pokemon> findPokemons(){
	   List<Pokemon> pokemons = service.findPokemons();
	   return pokemons;
	}
	
	@GetMapping("/{id}")
	public Optional<Pokemon> findPokemonById(@PathVariable Long id){
		Optional<Pokemon> pokemon = service.findPokemonById(id);
		return pokemon;
	}
}