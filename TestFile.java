package bd.edu.diu.bank;

import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="This is Test Data ";
		FileWriter writer = null;
		try {
			 writer=new FileWriter("Test.txt",true);
					writer.write(data);
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
	}

}
