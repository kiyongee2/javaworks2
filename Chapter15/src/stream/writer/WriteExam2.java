package stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam2 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/IO/test4.txt");
		char[] data = "ȫ�浿�̴�".toCharArray();
		writer.write(data);
		writer.flush();
		writer.close();
	}

}
