package arraylist;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		Dog dog1 = new Dog();
		dog1.setName("�鱸1");
		dog1.setType("������");
		
		Dog dog2 = new Dog();
		dog2.setName("�鱸1");
		dog2.setType("������");
		
		Dog dog3 = new Dog();
		dog3.setName("�鱸1");
		dog3.setType("������");
		
		Dog dog4 = new Dog();
		dog4.setName("�鱸1");
		dog4.setType("������");
		
		Dog dog5 = new Dog();
		dog5.setName("�鱸1");
		dog5.setType("������");
		
		//dogList�� ����
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
		dogList.add(dog5);
		
		//���
		for(int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		//��� for
		for(Dog dog : dogList)
			System.out.println(dog.showDogInfo());
	}
}
