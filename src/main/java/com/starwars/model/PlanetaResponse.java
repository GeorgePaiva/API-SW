package com.starwars.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gpaiva
 *
 */
@Data
@NoArgsConstructor
public class PlanetaResponse {

	private String id;
	private String nome;
	private String clima;
	private String terreno;
	private int qteAparicoes;

	public PlanetaResponse(String id, String nome, String clima, String terreno, int qteAparicoes) {
		this.id = id;
		this.nome = nome;
		this.clima = clima;
		this.terreno = terreno;
		this.qteAparicoes = qteAparicoes;
	}

}
