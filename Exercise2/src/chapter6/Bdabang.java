package chapter6;

public class Bdabang {
	String dabangName;
	int customerCount;
	int money;
	
	public Bdabang(String dabangName) {
		this.dabangName = dabangName;
	}
	
	public void eatCoffee(int money) {
		this.money += money;
		customerCount++;
	}
	
	public void showInfo() {
		System.out.println(dabangName + "�մ��� " + customerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
}
