package chapter7;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog("���","������1"));
		dogList.add(new Dog("�ູ","������2"));
		dogList.add(new Dog("����","������3"));
		dogList.add(new Dog("���","������4"));
		dogList.add(new Dog("���","������5"));
		
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
