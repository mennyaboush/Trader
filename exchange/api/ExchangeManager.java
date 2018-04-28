package exchange.api;

import java.util.List;
import java.util.Map;
import java.util.Set;

import auth.api.WrongSecretException;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ExchangeManager extends Remote {

	/* The trading service */
	
	// Places an ask (request to sell) for amount of stockName at a price of (at least) price. 
	// Returns the identifier of the ask. 
	
	public Integer placeAsk(String secret, Integer accoundId, String stockName, Integer amount, Integer price) 
			throws RemoteException, WrongSecretException, NoSuchAccountException, NotEnoughStockException, StockNotTradedException, DoesNotHaveThisStockException, InternalExchangeErrorException;

	// Places a bid (request to buy) an amount of stockName at a price of (at most) price. 
	// Returns the identifier of the bid.
	
	public Integer placeBid(String secret, Integer accoundId, String stockName, Integer amount, Integer price) 
			throws RemoteException, WrongSecretException, NoSuchAccountException, NotEnoughStockException, StockNotTradedException, InternalExchangeErrorException;

	// Returns the list of identifiers of all the open orders of accountId. 
	// An order is open as long as its amount is not 0. 
	
	public List<Integer> getOpenOrders(String secret, Integer accoundId) throws RemoteException, NoSuchAccountException, WrongSecretException, InternalExchangeErrorException;
	
	// Returns the details of the order with identifier orderId, provided that it belongs to accountId. 
	
	public Order getOrderDetails(String secret, Integer accoundId, Integer orderId) throws RemoteException, WrongSecretException, NoSuchAccountException, InternalExchangeErrorException;

	public Set<String> getAssets(String secret, Integer accountId) throws RemoteException, NoSuchAccountException, WrongSecretException, InternalExchangeErrorException;
	
	public Integer getAmountOfAsset(String secret, Integer accountId, String assetName) throws RemoteException, NoSuchAccountException, WrongSecretException, InternalExchangeErrorException;
	
	/*
	// Equivalent to setting the amount of this order to 0.
	
	public void cancelOrder(String secret, Integer accountId, Integer orderId);
	
	public void updateOrderPrice(String secret, Integer accountId, Integer orderId, Integer price);

	public void updateOrderAmount(String secret, Integer accountId, Integer orderId, Integer amount);	
	 */
	
	/* The information service */
	
	// returns the names of the stocks that are being traded in the exchange
	
	public Set<String> getStockNames() throws RemoteException; 

	// Returns the supply of stockName. The keys are different prices, the values are the amounts of stock supplied at each price.
	
	public  Map<Integer, Integer> getSupply(String stockName) throws RemoteException;

	// Returns the demand of stockName. The keys are different prices, the values are the amounts of stock demanded at each price.

	public  Map<Integer, Integer> getDemand(String stockName) throws RemoteException;
	
}
