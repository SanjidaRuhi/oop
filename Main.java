package bd.edu.diu.bank;

public class Main {

	public static void main(String[] args) {
		/*
		 * Customer customer=new Customer(1000,"Sithi","DIU panthapoth","566","xyx");
		 * System.out.println(customer); customer.display(); Customer customer2=new
		 * Customer(); customer2.setName("Sithi"); customer2.setId(1001);
		 * customer2.setAddress("Diu"); customer2.setPhone("333333");
		 * customer2.setEmail("Sithi@diu.edu"); System.out.println(customer2);
		 * customer2.display(); Customer customer3=new Customer(customer);
		 * customer3.display(); System.out.println(customer3);
		 * System.out.println(customer==customer3);
		 * System.out.println(customer.equals(customer3));
		 */
		
		
		Accounts accounts=new Accounts();
		System.out.println(accounts);
		accounts.setAccNo(1001);
		accounts.setTitle("jeba");
		accounts.setBalance(1000);
		System.out.println(accounts);
        Transaction tr1=new Transaction(1,"joma ");
        			tr1.deposit(accounts, 1000);
       // System.out.println(tr1);			
		//System.out.println(accounts);
		Transaction tr2=new Transaction(2,"Basha bara ");
		tr2.withdrown(accounts, 500);
		
		Accounts accounts2=new Accounts();
		accounts.setAccNo(1002);
		accounts.setTitle("xyz");
		accounts.setBalance(500);
		// System.out.println(tr2);			
		//System.out.println(accounts);
		AccountTransfer t3=new AccountTransfer(3,"Transfer ") ; 
         t3.transfer(accounts, accounts2, 1300);
		//System.out.println(accounts);
		accounts.display();
		accounts2.display();
	}
}
