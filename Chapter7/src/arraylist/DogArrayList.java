package arraylist;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		Dog dog1 = new Dog();
		dog1.setName("백구1");
		dog1.setType("진돗개");
		
		Dog dog2 = new Dog();
		dog2.setName("백구1");
		dog2.setType("진돗개");
		
		Dog dog3 = new Dog();
		dog3.setName("백구1");
		dog3.setType("진돗개");
		
		Dog dog4 = new Dog();
		dog4.setName("백구1");
		dog4.setType("진돗개");
		
		Dog dog5 = new Dog();
		dog5.setName("백구1");
		dog5.setType("진돗개");
		
		//dogList에 저장
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
		dogList.add(dog5);
		
		//출력
		for(int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		//향상 for
		for(Dog dog : dogList)
			System.out.println(dog.showDogInfo());
	}
}
