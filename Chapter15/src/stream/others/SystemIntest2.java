package stream.others;

import java.io.IOException;
public class SystemIntest2 {

	public static void main(String[] args) {
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		int i = 0;
//		try {
//			while((i=System.in.read()) !=-1){
//				System.out.print((char)i);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			while((i=System.in.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
