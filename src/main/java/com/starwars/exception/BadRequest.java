/**
 * 
 */
package com.starwars.exception;

/**
 * @author gpaiva
 *
 */
public class BadRequest extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BadRequest(String msg) {
		super(msg);
	}

}
