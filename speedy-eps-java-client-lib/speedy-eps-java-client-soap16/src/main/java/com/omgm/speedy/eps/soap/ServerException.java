package com.omgm.speedy.eps.soap;

/**
 * Server Exception is thrown in case communication with server failed
 */
public class ServerException extends Exception {

	/**
	 * Serializable serial version 
	 */
	private static final long serialVersionUID = -1;

	/**
     * Constructs new instance of exception
     * @param ex Parent exception
     */
	public ServerException(Exception ex) {
		super(ex);
	}
	
	/**
     * Constructs new instance of exception
     * @param sMsg Message
     */
	public ServerException(String sMsg) {
		super(sMsg);
	}
}
