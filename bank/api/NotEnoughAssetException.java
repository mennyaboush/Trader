package bank.api;

import java.io.Serializable;

public class NotEnoughAssetException extends Exception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3747735412061202956L;
	
	private Integer account;
	private String asset;
	private Integer currentAmount;
	private Integer requestedAmount;

	public NotEnoughAssetException(Integer account, String asset, Integer currentAmount, Integer requestedAmount) {

		this.account = account;
		this.asset = asset;
		this.currentAmount = currentAmount;
		this.requestedAmount= requestedAmount;
	}

	public Integer getAccount() { return account; }
	public String getAsset() { return asset; }
	public Integer getCurrentAmount() { return currentAmount; }
	public Integer getRequestedAmount() { return requestedAmount; }
}
