package cooperation;

public class Subway {
	int lineNumber;
	int passenger;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showInfo() {
		System.out.println("����ö " + lineNumber + "ȣ�� �°��� " + passenger 
				        + "���̰�, ������" + money + "�Դϴ�.");
	}
	
}
