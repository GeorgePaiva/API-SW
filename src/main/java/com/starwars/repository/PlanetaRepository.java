/**
 * 
 */
package com.starwars.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.starwars.model.Planeta;

/**
 * @author gpaiva
 *
 */
public interface PlanetaRepository extends MongoRepository<Planeta, String> {

	List<Planeta> findByNomeContaining(String nome);

}
