package chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test11_2 {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		String strDay = (day < 10) ? ("0" + day) : ("" + day);
		
		int hour = now.get(Calendar.HOUR);
		String strHour = (hour < 10) ? ("0" + hour) : ("" + hour);
		int minute = now.get(Calendar.MINUTE);
		String strMinute = (minute < 10) ? ("0" + minute) : ("" + minute);
		
		//����
		String[] days = new String[] {"��", "��", "ȭ", "��", "��", "��", "��"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week-1);
		String strWeek = days[dayOfWeek-1];
		
		System.out.println(year + "�� " + strMonth + "�� " + strDay + "�� " + 
		                   strWeek + "���� " + strHour + "�� " + strMinute + "�� ");
	}
}
