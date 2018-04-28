package bank.api;

import java.util.Date;
import java.util.List;
import java.util.Set;

import java.rmi.Remote;
import java.rmi.RemoteException;

import auth.api.WrongSecretException;

public interface BankManager extends Remote {

	// Transfers amount of asset from source account to destination account. The secret must match the source account's secret.

	public void transferAssets(String secret, Integer sourceAccount, Integer destinationAccount, String asset, Integer amount) 
			throws DoesNotHaveThisAssetException, NotEnoughAssetException, RemoteException, WrongSecretException, InternalServerErrorException;

	// Returns the transactions that were executed at or after date. For example, getLatestTransactions(..., new Date("12/5/2010")) returns a list of all the transactions executed at or after May 12, 2010.

	public List<Transaction> getTransactionsSince(String secret, Integer account, Date date) 
			throws RemoteException, WrongSecretException, InternalServerErrorException;

	// Returns all the asset names held in account
	
	public Set<String> getAssets(String secret, Integer account) 
			throws RemoteException, WrongSecretException, InternalServerErrorException;

	// Returns the amount of asset in account
	
	public Integer getQuantityOfAsset(String secret, Integer account, String asset) 
			throws RemoteException, WrongSecretException, DoesNotHaveThisAssetException, InternalServerErrorException;
}
