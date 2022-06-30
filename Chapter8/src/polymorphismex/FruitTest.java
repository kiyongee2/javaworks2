package polymorphismex;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.���� | 2.������ | 3.�ٳ��� ");
		System.out.print("����> ");
		int selectNo = Integer.parseInt(scanner.nextLine());
		
		Fruit fruit = null;
		if(selectNo==1) {
			fruit = new Grape();
		}else if(selectNo==2) {
			fruit = new Peach();
		}else if(selectNo==3) {
			fruit = new Banana();
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		fruit.showInfo();
		scanner.close();
	}
}
