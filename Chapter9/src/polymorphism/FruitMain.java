package polymorphism;

import java.util.Scanner;

class Fruit{
	String name;
	int price;
	int freshness;
	
	public void showFruitInfo() {
		System.out.println("���� �̸� : " + name);
		System.out.println("���� : " + price); 
		System.out.println("�ż��� : " + freshness);
	}
}

class Apple extends Fruit{
	public Apple() {
		name = "���";
		price = 2000;
		freshness = 90;
	}
}

class Peach extends Fruit{
	public Peach() {
		name = "������";
		price = 1500;
		freshness = 85;
	}
}

class Banana extends Fruit{
	public Banana() {
		name = "�ٳ���";
		price = 1000;
		freshness = 75;
	}
}

public class FruitMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.��� | 2.������ | 3.�ٳ���");
		System.out.println("����> ");
		int menu = sc.nextInt();
		Fruit fruit;
		switch(menu){
		case 1:
			fruit = new Apple();
			fruit.showFruitInfo();
			break;
		case 2:
			fruit = new Peach();
			fruit.showFruitInfo();
			break;
		case 3:
			fruit = new Banana();
			fruit.showFruitInfo();
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");	
			break;
		}

	}

}


















