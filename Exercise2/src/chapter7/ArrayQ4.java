package chapter7;

public class ArrayQ4 {

	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("���", "������1");
		dogArray[1] = new Dog("�ູ", "������2");
		dogArray[2] = new Dog("����", "������3");
		dogArray[3] = new Dog("���", "������4");
		dogArray[4] = new Dog("���", "������5");
		
		for(int i=0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println("===���� for====");
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}

}
