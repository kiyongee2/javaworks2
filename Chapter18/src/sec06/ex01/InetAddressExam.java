package sec06.ex01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ�� IP�ּ�: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			/*
			 * for(int i=0; i<iaArr.length; i++) { System.out.println("���̹��� IP�ּ� : " +
			 * iaArr[i].getHostAddress()); }
			 */
			for(InetAddress remote : iaArr)
				System.out.println("���̹��� IP �ּ� : " + remote.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}
