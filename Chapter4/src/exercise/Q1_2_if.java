package exercise;

public class Q1_2_if {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '4';
		int result = 0;
		
		if(operator=='+') {
			result = num1 + num2;
		}else if(operator=='-') {
			result = num1 - num2;
		}else if(operator=='*') {
			result = num1 * num2;
		}else if(operator=='/'){
			result = num1 / num2;
		}else {
			System.out.println("������ �����Դϴ�.");
		}
		System.out.println("������� "  + result + "�Դϴ�.");
	}
}
