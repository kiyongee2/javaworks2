package arraylist;

import java.util.ArrayList;

public class DogArrayList2 {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		Dog dog1 = new Dog("�鱸1", "������");
		Dog dog2 = new Dog("�鱸2", "����");
		Dog dog3 = new Dog("�鱸3", "Ǫ��");
		Dog dog4 = new Dog("�鱸4", "�ҵ�");
		Dog dog5 = new Dog("�鱸5", "ġ�Ϳ�");
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
		dogList.add(dog5);
		
		/*dogList.add(new Dog("�鱸1", "������"));
		dogList.add(new Dog("�鱸2", "����"));
		dogList.add(new Dog("�鱸3", "Ǫ��"));
		dogList.add(new Dog("�鱸4", "�ҵ�"));
		dogList.add(new Dog("�鱸5", "ġ�Ϳ�"));*/
		
		for(Dog dog : dogList)
			System.out.println(dog.showDogInfo());
		
		for(int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
	}
}
