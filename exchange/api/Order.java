package exchange.api;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6297735312702747686L;
	
	public static final String ASK = "A";
	public static final String BID = "B";
	
	private Integer id;
	private String kind;
	private String stockName;
	private Integer amount;
	private Integer price;
	private Date creationDate;

	public Order(Integer id, String kind, String stockName, Integer amount, Integer price, Date creationDate) {
		this.id = id;
		this.kind = kind;
		this.amount = amount;
		this.price = price;
		this.creationDate = creationDate;
		this.stockName = stockName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
