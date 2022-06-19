package decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("b.zip")){
			millisecond = System.currentTimeMillis();    //���Ϻ��� ���� �� �ð�
			int i=0;
			while((i=fis.read()) !=-1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis()-millisecond;  //���Ϻ��� �� �ð�
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����ϴ� �� " + millisecond + " milliseconds �ҿ�Ǿ����ϴ�.");
	}
}
