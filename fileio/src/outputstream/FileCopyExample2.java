package outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample2 {

	public static void main(String[] args) {
		//try ~ with ~ resource�� : close()�� ������� �ʾƵ� ��.
		long start = 0, end = 0;
		String originFile = "C:/File/bg0.jpg";  //���� ����
		String copyFile = "C:/File/bg2.jpg";    //���� ����
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis();  //���� �� ���� �ð�
			int i; 
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();     //���� �� ���� �ð�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ҿ�ð�: " + (end-start) + "ms");
	}
}
