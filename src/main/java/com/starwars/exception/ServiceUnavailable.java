/**
 * 
 */
package com.starwars.exception;

/**
 * @author gpaiva
 *
 */
public class ServiceUnavailable extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ServiceUnavailable(String msg) {
		super(msg);
	}
}
