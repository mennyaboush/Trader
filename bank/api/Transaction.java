package bank.api;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3371677487008192457L;

	public static final String DEPOSIT = "D";
	public static final String WITHDRAW = "W";
	
	private Integer amount;
	private String asset;
	private Integer source;
	private Integer destination;
	private Date executionDate;
	private String kind; // "D" for deposit, "W" for withdraw
	
	public Transaction(String kind, Integer amount, String asset, Integer source, Integer destination, Date executionDate) {
		this.kind = kind;
		this.amount = amount;
		this.asset = asset;
		this.source = source;
		this.destination = destination;
		this.executionDate = executionDate;
	}

	public Integer getAmount() { return amount; }

	public String getAsset() { return asset; }

	public Integer getSource() { return source; }

	public Integer getDestination() { return destination; }

	public Date getExecutionDate() { return executionDate; }

	public String getKind() { return kind; }
}
