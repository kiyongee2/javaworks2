package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output.txt");
		try(fos){
			byte[] bs = new byte[26];
			byte data = 'A';
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);     //�迭�� �Ѳ����� ���
			fos.write(10);     //�ƽ�Ű �ڵ� 10(LF-new line)
			fos.write(bs, 3, 10);
		}catch(IOException e) {
			System.out.println(e);
		}	
		System.out.println("��� �Ϸ�");
	}
}
