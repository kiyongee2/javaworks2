package util;

import java.util.Calendar;

public class CalendarTest2 {
	
	public static void main(String[] args) {
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
		
		//요일
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week-1);
		String strWeek = days[dayOfWeek-1];
		
		System.out.println(year + "년 " + strMonth + "월 " + strDay + "일 " + 
		                   strWeek + "요일 " + strHour + "시 " + strMinute + "분 ");
	}
}
