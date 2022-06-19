package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');    //���� 1��
			fw.write("�ȳ��ϼ���");  //���ڿ�
			char[] buf = {'B', 'C', 'D', 'E', 'F'};
			fw.write(buf);   //�迭
			fw.write(buf, 1, 2);
			fw.write(10);
			fw.write(100);
			int num = 20;
			fw.write(num);   //�ڵ尪�� ��µ�
			//fw.write(3.14);   //������ �Ǽ��� ����� �� ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("��� �Ϸ�");
	}
}
