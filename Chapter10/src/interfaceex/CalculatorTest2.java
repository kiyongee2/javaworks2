package interfaceex;

public class CalculatorTest2 {
	public static void main(String[] args) {
		//���������� ����
		int num1 = 10;
		int num2 = 5;
		
		Calc calc = new CompleteCalc();
		//Calc calc2 = new Calc();       // �������̽��̹Ƿ� �ν��Ͻ� ���� ����
		//Calc calc3 = new Calculator(); // �߻�Ŭ�����̹Ƿ� �ν��Ͻ� ���� ����
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		//calc.showinfo()�� ������ ����
		
		if(calc instanceof CompleteCalc) {
			CompleteCalc calculator = (CompleteCalc)calc;
			calculator.showInfo();
			
			calculator.description();
		}
	}
}
