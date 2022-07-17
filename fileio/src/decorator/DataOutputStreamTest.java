package decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data2.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeByte('K');
			dos.writeByte(50);    //아스키 코드값 -> 2(십진수)
			dos.writeChar('가');
			dos.writeInt(50);    //정수 50
			dos.writeFloat(2.54F);
			dos.writeUTF("감사합니다");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
	}

}
