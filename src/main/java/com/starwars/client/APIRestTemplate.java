/**
 * 
 */
package com.starwars.client;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.starwars.exception.ServiceUnavailable;
import com.starwars.model.ResultApiSW;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author gpaiva
 *
 */
@Service
@NoArgsConstructor
@AllArgsConstructor
public class APIRestTemplate {

	final static String url = "https://swapi.dev/api/planets/";

	RestTemplate restTemplate = new RestTemplate();

	public ResponseEntity<ResultApiSW> RetornaAparicoes() {
		try {
			return restTemplate.exchange(url, HttpMethod.GET, geraHeader(), ResultApiSW.class);
		} catch (Exception e) {
			throw new ServiceUnavailable("SWAPI fora do ar");
		}
	}

	public HttpEntity<String> geraHeader() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		return entity;
	}

}
