package bd.edu.diu.bank;

import java.util.ArrayList;

public class Accounts {
	
	private int accNo;
	private String title;
	private double balance;
	private ArrayList<Transaction> transactions=new ArrayList<Transaction>();

	
	public Accounts() {
		
	}
	/**
	 * @return the transactions
	 */
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	public Accounts(int accNo, String title, double balance) {
		
		this.accNo = accNo;
		this.title = title;
		this.balance = balance;
	}
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts \naccNo=" + accNo + ", title=" + title + ", balance=" + balance + "\n";
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		}
	
	
	public void withdrown(double amount) {
		if(balance>amount)
		balance=balance-amount;
		else
			System.out.println("Insaficient balance ");
			}	

public void display() {
		System.out.println("Account No "+getAccNo());
		System.out.println("Account No "+getTitle());
		System.out.println("transaction info ");
		for (Transaction transaction : getTransactions()) {
		System.out.println(transaction);	
		}
		
		System.out.println("Account No "+getBalance());
	}
}


