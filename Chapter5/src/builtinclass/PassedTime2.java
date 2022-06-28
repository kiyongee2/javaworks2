package builtinclass;

import java.util.Calendar;

public class PassedTime2 {

	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();  //시작일 객체 생성
		Calendar today = Calendar.getInstance();     //현재일 객체 생성
		
		startDay.set(2022, 4, 9);  //실제 월에서 1을 빼줌
		
		//날짜 출력
		System.out.println("시작일 - " + datePrint(startDay));
		System.out.println("현재 - " + datePrint(today));
		//현재 까지의 시간(1970년 1월 1일 자정 이후), ms 기준임
		System.out.println(today.getTimeInMillis() + "초");
		
		//지나온 시간 계산하기
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//초를 일로 환산
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("만난지 " + passedTime + "일이 지났습니다.");
	}
	
	public static String datePrint(Calendar cal) {
		String date = cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일";
		return date;
	}
}
