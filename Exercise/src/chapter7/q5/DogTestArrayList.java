package chapter7.q5;

import java.util.ArrayList;

import chapter7.q4.Dog;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		Dog dog1 = new Dog();
		dog1.setName("�鱸");
		dog1.setType("������");
		Dog dog2 = new Dog();
		dog2.setName("¯");
		dog2.setType("�ҵ�");
		Dog dog3 = new Dog();
		dog3.setName("�浿");
		dog3.setType("��찳");
		Dog dog4 = new Dog();
		dog4.setName("����");
		dog4.setType("Ǫ��");
		Dog dog5 = new Dog();
		dog5.setName("�˵���");
		dog5.setType("����");
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
		dogList.add(dog5);
		
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		System.out.println("===���� for===");
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}

	}

}
