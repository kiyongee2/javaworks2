package builtinclass;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();  //시작일 객체 생성
		Calendar today = Calendar.getInstance();     //현재일 객체 생성
		
		startDay.set(2022, 4, 9);  //실제 월에서 1을 빼줌
		
		//날짜 출력
		String startDay1 = startDay.get(Calendar.YEAR) + "년 " + (startDay.get(Calendar.MONTH) + 1) + "월 "
				+ startDay.get(Calendar.DATE) + "일";
		String today1 = today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 "
				+ today.get(Calendar.DATE) + "일";
		
		System.out.println("시작일 - " + startDay1);
		System.out.println("현재 - " + today1);
		//현재 까지의 시간(1970년 1월 1일 자정 이후), ms 기준임
		System.out.println(today.getTimeInMillis() + "초");
		
		//지나온 시간 계산하기
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//초를 일로 환산
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("만난지 " + passedTime + "일이 지났습니다.");
	}
}
