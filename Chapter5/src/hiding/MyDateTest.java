package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setYear(2020);
		date.setMonth(2);
		date.setDay(30);  //29인 경우 "윤년", 30일인 경우 "날짜 오류"
	}
}
