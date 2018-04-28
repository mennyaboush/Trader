package exchange.api;

import java.io.Serializable;

public class DoesNotHaveThisStockException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4351775894551964842L;
	
	private Integer accountId;
	private String assetName;

	public DoesNotHaveThisStockException(Integer accountId, String assetName) {
		this.accountId = accountId;
		this.assetName = assetName;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public String getAssetName() {
		return assetName;
	}

}
