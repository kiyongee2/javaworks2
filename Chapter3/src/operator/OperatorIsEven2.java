package operator;

import java.util.Scanner;

public class OperatorIsEven2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
		String str = (num % 2 ==  0) ? "¦��" : "Ȧ��";
		System.out.println(str);
		
		/*
		if(num%2==0) 
		    System.out.println("¦��");
		else
		    System.out.println("Ȧ��");
		*/
		
		scanner.close();
	}
}
