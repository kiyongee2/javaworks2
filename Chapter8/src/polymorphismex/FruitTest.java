package polymorphismex;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.��� |2.������ |3.�ٳ��� ");
		System.out.print("����> ");
		int selectNo = scanner.nextInt();
		Fruit fruit;
		if(selectNo==1) {
			fruit = new Apple();
			fruit.showInfo();
		}else if(selectNo==2) {
			fruit = new Peach();
			fruit.showInfo();
		}else if(selectNo==3) {
			fruit = new Banana();
			fruit.showInfo();
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		scanner.close();
	}
}
