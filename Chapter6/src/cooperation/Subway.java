package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("����ö " + lineNumber + "�� �°��� " + passengerCount + 
				"���̰�, ������  " + money + "�Դϴ�.");
	}
}
