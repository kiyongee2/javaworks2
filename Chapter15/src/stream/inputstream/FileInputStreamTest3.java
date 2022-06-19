package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i=0;
			while((i=fis.read(bs)) !=-1) {
//				for(int j=0; j<i; j++) {  //���� ���� ��ŭ�� ���
//					System.out.print((char)bs[j]);
//				}
		
				for(byte b : bs) {  //���۸� ��°�� 10���� �������
					System.out.print((char)b);
				}
				System.out.println(": " + i + "����Ʈ ����");
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
