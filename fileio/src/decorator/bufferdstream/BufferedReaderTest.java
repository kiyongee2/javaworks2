package decorator.bufferdstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("animal.txt");
			BufferedReader br = new BufferedReader(fr)){
			
			String[] animal = null;
			/*String line = null;
			while((line = br.readLine()) != null) {
				animal = line.split(" ");
			}*/
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				animal = line.split(" "); //���� ���ڷ� ����
			}
			System.out.println(animal[0]);  //0�� �ε��� 
			
			for(int i=0; i<animal.length; i++) {
				System.out.println(animal[i]);
			}
			System.out.println("================");
			//���� ���
			int rand = (int) (Math.random()*animal.length);
			System.out.println(animal[rand]);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
