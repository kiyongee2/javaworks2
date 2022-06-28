package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;    //°¡Áø µ·
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1200);  //1200¿øÀ» ³¿
		money -= 1200;   //°¡Áøµ· 1200¿ø Â÷°¨
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "´ÔÀÇ ³²Àº µ·Àº " + money);
	}
}
