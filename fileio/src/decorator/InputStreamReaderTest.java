package decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStream fis = new FileInputStream("reader.txt");
			InputStreamReader isr = new InputStreamReader(fis)){
			int readByte;
			while((readByte = isr.read()) != -1) {
				System.out.print((char)readByte);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
