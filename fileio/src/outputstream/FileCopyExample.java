package outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

	public static void main(String[] args) {
		
		String originFile = "C:/File/bg0.jpg";  //원본 파일
		String copyFile = "C:/File/bg1.jpg";    //복사 파일
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			int i;
			while((i=fis.read()) != -1) {  //이미지 읽기
				fos.write(i);              //이미지 쓰기
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
