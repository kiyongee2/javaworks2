package decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data2.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeByte('K');
			dos.writeByte(50);    //�ƽ�Ű �ڵ尪 -> 2(������)
			dos.writeChar('��');
			dos.writeInt(50);    //���� 50
			dos.writeFloat(2.54F);
			dos.writeUTF("�����մϴ�");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�!");
	}

}
