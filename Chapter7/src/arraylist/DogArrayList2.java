package arraylist;

import java.util.ArrayList;

public class DogArrayList2 {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		Dog dog1 = new Dog("백구1", "진돗개");
		Dog dog2 = new Dog("백구2", "시츄");
		Dog dog3 = new Dog("백구3", "푸들");
		Dog dog4 = new Dog("백구4", "불독");
		Dog dog5 = new Dog("백구5", "치와와");
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);
		dogList.add(dog5);
		
		/*dogList.add(new Dog("백구1", "진돗개"));
		dogList.add(new Dog("백구2", "시츄"));
		dogList.add(new Dog("백구3", "푸들"));
		dogList.add(new Dog("백구4", "불독"));
		dogList.add(new Dog("백구5", "치와와"));*/
		
		for(Dog dog : dogList)
			System.out.println(dog.showDogInfo());
		
		for(int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
	}
}
