package decorator.bufferdstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader fr = null;
		try {
			fr = new FileReader("reader.txt");
			int data;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
