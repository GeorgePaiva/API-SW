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
public class ResultApiSW {
	private List<PlanetaApiSW> results;

	public ResultApiSW(List<PlanetaApiSW> results, String name) {
		this.results = results;
	}

}
