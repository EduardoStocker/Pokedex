package com.eduardo.projetinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardo.projetinho.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}