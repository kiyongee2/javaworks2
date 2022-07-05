package exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("Done.");
	 }
}