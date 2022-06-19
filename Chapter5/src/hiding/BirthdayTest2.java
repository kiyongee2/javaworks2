package hiding;

class BirthDay1{
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month==2) {
			if(day<1 || day>28) {
				System.out.println("��¥ �����Դϴ�.");
				this.day = day;
			}else if(day==29) {
				if((year%4==0 && year%100 !=0) || year%400==0) {
					System.out.println("�����Դϴ�.");
					this.day = day;
				}
			}
			else {
				this.day = day;
			}
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showInfo() {
		System.out.println("��¥�� " + getYear() + "�� " + getMonth() + "�� " + getDay() + "�� ");
	}
}


public class BirthdayTest2 {

	public static void main(String[] args) {
		BirthDay1 day = new BirthDay1();
		day.setYear(2010);
		day.setMonth(2);
		day.setDay(30);
		
		day.showInfo();
		
	}
}
