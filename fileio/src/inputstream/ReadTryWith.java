package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadTryWith {

	public static void main(String[] args) throws IOException {
		//try ~ with ���� ���
		try(InputStream is = new FileInputStream("C:/file/test3.db")){
		
			byte[] buffer = new byte[5];
			
			/*int data;
			while((data = is.read(buffer, 2, 3)) != -1) { 
				//3byte�� �а� buffer[2], buffer[3], buffer[4]�� ����
				for(int i = 0; i < buffer.length; i++) {  //�迭�� ��ü�� �ݺ�
					System.out.println(buffer[i]);
				}
			}*/
			while(true) {
				int data = is.read(buffer, 2, 3);
				if(data == -1) break;
				for(int i = 0; i < buffer.length; i++) {  //�迭�� ��ü�� �ݺ�
					System.out.println(buffer[i]);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}