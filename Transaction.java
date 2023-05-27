package bd.edu.diu.bank;

import java.util.Date;

public class Transaction {

		private int trId;
		private String purpose;
		private Date date;
		private double amount;
		private String type;
		private Accounts byAccounts;
		/**
		 * @return the trId
		 */
		public int getTrId() {
			return trId;
		}
		/**
		 * @param trId the trId to set
		 */
		public void setTrId(int trId) {
			this.trId = trId;
		}
		/**
		 * @return the purpose
		 */
		public String getPurpose() {
			return purpose;
		}
		/**
		 * @param purpose the purpose to set
		 */
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
		/**
		 * @return the date
		 */
		public Date getDate() {
			return date;
		}
		/**
		 * @param date the date to set
		 */
		public void setDate(Date date) {
			this.date = date;
		}
		/**
		 * @return the amount
		 */
		public double getAmount() {
			return amount;
		}
		/**
		 * @param amount the amount to set
		 */
		public void setAmount(double amount) {
			this.amount = amount;
		}
		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}
		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}
		/**
		 * @return the byAccounts
		 */
		public Accounts getByAccounts() {
			return byAccounts;
		}
		/**
		 * @param byAccounts the byAccounts to set
		 */
		public void setByAccounts(Accounts byAccounts) {
			this.byAccounts = byAccounts;
		}
		public Transaction() {
			super();
		}
		public Transaction(int trId, String purpose) {
			super();
			this.trId = trId;
			this.purpose = purpose;
		}
		
		public void deposit(Accounts by,double amount) {
			setByAccounts(by);
			setType("Deposit");
			setAmount(amount);
			by.deposit(amount);
			setDate(new Date());
		byAccounts.getTransactions().add(this);
				
		}
		public void withdrown(Accounts by,double amount) {
			setByAccounts(by);
			setType("Withdrown");
			setAmount(amount);
			by.withdrown(amount);
			setDate(new Date());
			byAccounts.getTransactions().add(this);
		}
		@Override
		public String toString() {
			return "\nTransaction \ntrId=" + trId + ", purpose=" + purpose + ", date=" + date + ", amount=" + amount
					+ ", type=" + type+ "\n";
		}
		
		
		
}
