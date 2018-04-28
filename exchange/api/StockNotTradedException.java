package exchange.api;

import java.io.Serializable;

public class StockNotTradedException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4245906801153665311L;

	private String stockName;

	public StockNotTradedException(String stockName) {
		this.stockName = stockName;
	}

	public String getStockName() {
		return stockName;
	}

}
