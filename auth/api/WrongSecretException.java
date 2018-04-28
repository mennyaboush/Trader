package auth.api;

import java.io.Serializable;

public class WrongSecretException extends Exception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1812859705273310687L;
	
	String operationName;
	Integer callerId;
	
	public WrongSecretException(String opName, Integer id) {
		operationName = opName;
		callerId = id;
	}
	
	public String getOperationName() {
		return operationName;
	}
	
	public Integer getCallerId() {
			return callerId;
	}
}
