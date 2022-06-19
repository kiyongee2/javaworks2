package methodoverriding;

class Calculator{
	double areaCircle(double radius) {
		System.out.println("Calculator ��ü�� areaCircle() ����");
		return 3.14 * radius * radius;
	}
}

class Computer extends Calculator{
	@Override
	double areaCircle(double radius) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * radius * radius;
	}
	
}
public class ComputerTest {

	public static void main(String[] args) {
		int radius = 10;
		Calculator calculator = new Calculator();
		System.out.println("���� ���� : " + calculator.areaCircle(radius));
		
		Computer computer = new Computer() ;
		System.out.println("���� ����: " + computer.areaCircle(radius));
	}

}
