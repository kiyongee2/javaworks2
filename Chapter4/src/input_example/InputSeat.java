package input_example;

import java.util.Scanner;

public class InputSeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���尴 �� �Է� : ");
		int customNum = sc.nextInt();
		
		System.out.print("�¼� �� �� �Է� : ");
		int colNum = sc.nextInt();
		
		int rowNum = 0; //��(��) ��
		
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else {
			rowNum = customNum / colNum + 1;
		}
		System.out.println(rowNum + "���� ���� �ʿ��մϴ�.");
		
		sc.close();
	}
}
