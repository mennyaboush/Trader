package bank.api;

import java.io.Serializable;

public class DoesNotHaveThisAssetException extends Exception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7210351165358463639L;
	
	private String asset;
	private Integer account;

	public DoesNotHaveThisAssetException(Integer account, String asset) {
		this.account = account;
		this.asset = asset;
	}

	public String getAsset() {
		return asset;
	}

	public Integer getAccount() {
		return account;
	}
}
