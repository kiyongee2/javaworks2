package input_example;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) throws IOException{
		System.out.println("���ڳ� ���ڸ� ���� [Enter]�� �������� ");
		int i = 0;
		while((i=System.in.read()) != -1) {
			System.out.print((char)i);
		}
	}
}
