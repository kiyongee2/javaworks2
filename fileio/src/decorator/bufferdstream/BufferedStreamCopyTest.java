package decorator.bufferdstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopyTest {

	public static void main(String[] args) {
		long start = 0, end = 0;
		
		String originFile = "C:/File/bg0.jpg";  //���� ����
		String copyFile = "C:/File/copy_bg.jpg";    //���� ����
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			start = System.currentTimeMillis();
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			end = System.currentTimeMillis();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ҿ�ð�: " + (end-start) + "ms");
	}
}
