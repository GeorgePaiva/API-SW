/**
 * 
 */
package com.starwars.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gpaiva
 *
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetaApiSW {

	private String name;
	private List<String> films;

	public PlanetaApiSW(String name, List<String> films) {
		this.name = name;
		this.films = films;
	}

}
