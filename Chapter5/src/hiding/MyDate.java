package hiding;

public class MyDate {
	//�ʵ�
	private int day;
	private int month;
	private int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				if(day == 29) {  //������ ���
					if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						System.out.println("�����Դϴ�.");
					}
				}else {
					System.out.println("��¥ �����Դϴ�.");
				}
			}else {
				this.day = day;
			}
		}
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}	
}
