package abstractcar;

public class Bus extends Car {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void refuel() {
		System.out.println("õ�������� �����մϴ�.");	
	}
	
	public void takrPassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}
}
