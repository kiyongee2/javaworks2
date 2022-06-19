package cooperation;

public class Bus {
	int busNumber;
	int passenger;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passenger + 
				          "���̰�, ������ " + money + "�Դϴ�.");
	}
	
}
