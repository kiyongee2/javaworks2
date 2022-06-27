package enumtype;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		Date today = new Date();  //오늘 날짜 객체 생성
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd"); //날짜 포맷
		System.out.println(date.format(today));
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); //시간 포맷
		System.out.println(time.format(today)); 
	}
}
