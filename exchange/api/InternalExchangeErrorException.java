package exchange.api;

import java.io.Serializable;

public class InternalExchangeErrorException extends Exception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3452597701882129222L;

	public InternalExchangeErrorException(String message) {
		super(message);
	}
}
