package bd.edu.diu.bank;

import java.lang.reflect.WildcardType;

public class AccountTransfer extends Transaction {
	
	Accounts ToAccounts;

	public AccountTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountTransfer(int trId, String purpose) {
		super(trId, purpose);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the toAccounts
	 */
	public Accounts getToAccounts() {
		return ToAccounts;
	}

	/**
	 * @param toAccounts the toAccounts to set
	 */
	public void setToAccounts(Accounts toAccounts) {
		ToAccounts = toAccounts;
	}
	
	public void transfer(Accounts to,Accounts by,double amount) {
		setToAccounts(to);
		deposit(to, amount);
		withdrown(by, amount);
	    
	}

	@Override
	public String toString() {
		return "AccountTransfer [ToAccounts=" + ToAccounts.getAccNo() + ", getTrId()=" + getTrId() + ", getDate()=" + getDate()
				+ ", getAmount()=" + getAmount() + ", getType()=" + getType() + ", getByAccounts()=" + getByAccounts()
				+ "]";
	}

}
