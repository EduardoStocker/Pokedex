package com.eduardo.projetinho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.eduardo.projetinho.model.Pokemon;
import com.eduardo.projetinho.repositories.PokemonRepository;

@Service
public class PokemonServices {

	@Autowired
	private PokemonRepository repository;
	
	public List<Pokemon> findPokemons(){
		return repository.findAll();
	}
	
	public Optional<Pokemon> findPokemonById(@PathVariable Long id) {
		return repository.findById(id);
	}
	
}
