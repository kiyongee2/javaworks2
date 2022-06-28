package builtinclass;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//��¥
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		//�ð�
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//����
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "�� " + month + "�� " + date + "��");
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
		System.out.println(day);  //1-��, 2-ȭ... 6-��
	}
}
