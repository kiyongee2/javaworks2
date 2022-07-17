package decorator.bufferdstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("reader.txt");    //기반 스트림 객체 생성
		
		BufferedReader br = new BufferedReader(fr);  //보조 스트림 객체 생성
		
		String line = null;
		while((line=br.readLine()) != null) {
			System.out.println(line);
		}
		
		/*while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
		}*/
		
		br.close();
	}
}

