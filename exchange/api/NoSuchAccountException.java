package exchange.api;

import java.io.Serializable;

public class NoSuchAccountException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1479571172486964722L;

	public NoSuchAccountException(Integer bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	
	public Integer getBankAccountId() { return bankAccountId; }
	
	private Integer bankAccountId;
}
