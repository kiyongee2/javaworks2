package casting;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	public static ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());
		
		for(Animal ani : animalList) {
			ani.move();
		}
		
		System.out.println("===���� ������ �ٿ� ĳ����===");
		aTest.testCasting();  //�޼��� ȣ��
	}

	//animal ��ü �߰�
	public void addAnimal() {
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());
		
		for(Animal ani : animalList) {
			ani.move();
		}
	}
	
	//���� Ÿ�� ��ȯ �޼���
	public void testCasting() {
		
		for(int i=0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
			
			if(animal instanceof Human) { //animal�� Human�� ��ü���
				Human human = (Human)animal;  //Human Ÿ������ ���� ����ȯ
				human.readBook();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	
	//��� for�� ����
	public void testCasting2() {
		for(Animal animal : animalList) {
			if(animal instanceof Human) {
				Human h = (Human)animal;
				h.readBook();
			}else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			}else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
}

