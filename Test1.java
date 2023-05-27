package bd.edu.diu.bank;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts accounts=new Accounts();
		System.out.println(accounts);
		accounts.setAccNo(1001);
		accounts.setTitle("jeba");
		accounts.setBalance(1000);
		System.out.println(accounts);
		Transaction tr1=new Transaction(1,"joma ");
		tr1.deposit(accounts, 1000);
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("acc.txt",true);
			fileWriter.write(accounts.toString());
			fileWriter.write(tr1.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
