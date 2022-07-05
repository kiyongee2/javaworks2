package exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
		String data = null;
		//System.out.println(data.toString()); //NullPointerException 발생
		
		String data1 = "100";
		String data2 = "a200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //NumberFormatException 발생
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	 }
}
