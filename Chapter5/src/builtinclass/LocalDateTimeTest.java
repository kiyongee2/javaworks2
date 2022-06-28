package builtinclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		//LocalDate, LocalTime Ŭ���� ���
		LocalDate localDate = LocalDate.now(); //���ѹα� ǥ�س�¥
		System.out.println(localDate);     
		
		LocalTime localTime = LocalTime.now(); //���ѹα� ǥ�ؽð�
		System.out.println(localTime);     
		
		LocalDateTime now = LocalDateTime.now();  //���ѹα� ǥ�� ��¥/�ð�
		System.out.println(now);
		
		//��¥, �ð� ���� ����
	    DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");  
	    //String formattedDate = now.format(dtFormat);  
	    //System.out.println(formattedDate);  
	    System.out.println(now.format(dtFormat));
	}
}
