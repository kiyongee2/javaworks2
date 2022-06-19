package exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest4 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("out2.txt")){
			for(int i=1; i<=10; i++) {
				String data = i + "��° ���Դϴ�.\n";
				fos.write(data.getBytes());;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �Ϸ�");
	}
}
