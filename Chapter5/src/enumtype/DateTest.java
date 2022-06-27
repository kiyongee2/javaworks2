package enumtype;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date today = new Date();  //���� ��¥ ��ü ����
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd"); //��¥ ����
		System.out.println(date.format(today));
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); //�ð� ����
		System.out.println(time.format(today)); 
	}
}
