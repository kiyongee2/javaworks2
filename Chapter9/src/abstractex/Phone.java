package abstractex;

public abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void powerOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void powerOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
