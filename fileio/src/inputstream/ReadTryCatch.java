package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadTryCatch {

	public static void main(String[] args){
		//try ~ catch ~ finally ±¸¹®
		InputStream is = null;
		try {
			is = new FileInputStream("C:/file/test2.db");
			byte[] buffer = new byte[10];
			
			while(true) {
				int data = is.read(buffer);
				if(data == -1) break;
				for(int i = 0; i < data; i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
