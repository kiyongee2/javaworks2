package outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

	public static void main(String[] args) {
		
		String originFile = "C:/File/bg0.jpg";  //���� ����
		String copyFile = "C:/File/bg1.jpg";    //���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			int i;
			while((i=fis.read()) != -1) {  //�̹��� �б�
				fos.write(i);              //�̹��� ����
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
