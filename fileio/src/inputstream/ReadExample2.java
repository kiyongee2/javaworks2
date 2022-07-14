package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		
		//�����Ͱ� test2.db�� ����Ʈ ��� ���� �Է� ��Ʈ�� ����
		InputStream is = new FileInputStream("C:/file/test2.db");
		
		byte[] buffer = new byte[10];
		
		int data;
		while((data = is.read(buffer)) != -1) { //�迭 ���� ��ŭ �о� ���� ���� �����ϸ�
			for(int i = 0; i < data; i++) {  //���� ����Ʈ ����ŭ �ݺ�
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
