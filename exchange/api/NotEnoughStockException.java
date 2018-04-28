package exchange.api;

import java.io.Serializable;

public class NotEnoughStockException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4518821494663619724L;
	
	private Integer accountId;
	private String asset;
	private Integer currentAmount;
	private Integer requestedAmount;

	public NotEnoughStockException(Integer account, String asset, Integer currentAmount, Integer requestedAmount) {

		this.accountId = account;
		this.asset = asset;
		this.currentAmount = currentAmount;
		this.requestedAmount= requestedAmount;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public Integer getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(Integer currentAmount) {
		this.currentAmount = currentAmount;
	}

	public Integer getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(Integer requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

}
