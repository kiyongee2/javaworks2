package others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException{
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);   //int�� 4����Ʈ�̹Ƿ� 4��° ��ġ��
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);  //double�� 8����Ʈ�� 12��° ��ġ
		System.out.println(rf.getFilePointer());
		
		rf.writeUTF("������");   //�� ���ڴ� 3byte + 2(Null char)
		System.out.println(rf.getFilePointer());
		
		rf.seek(0);  //���� ������ ��ġ �̵�. �� ��
	  
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
