package bank.api;

import java.io.Serializable;

public class InternalServerErrorException extends Exception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6492726773632363720L;

	public InternalServerErrorException(String message) {
		super(message);
	}
}
