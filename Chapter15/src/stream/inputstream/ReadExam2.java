package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/IO/test.txt");
		int readByteNo;   //����Ʈ �� ����
		byte[] readBytes = new byte[3];  //���� ������ ����
		/*
		while((readByteNo=is.read(readBytes)) != -1) {
			System.out.println(readByteNo);
		}*/
		String data = "";    //���ڿ��� ��ȯ�ϱ�
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			System.out.println(readByteNo);
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
