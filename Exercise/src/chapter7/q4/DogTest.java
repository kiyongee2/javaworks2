package chapter7.q4;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog();
		dogArray[0].setName("�鱸");
		dogArray[0].setType("������");
		dogArray[1] = new Dog();
		dogArray[1].setName("¯");
		dogArray[1].setType("�ҵ�");
		dogArray[2] = new Dog();
		dogArray[2].setName("�ູ");
		dogArray[2].setType("Ǫ��");
		dogArray[3] = new Dog();
		dogArray[3].setName("���");
		dogArray[3].setType("��찳");
		dogArray[4] = new Dog();
		dogArray[4].setName("����");
		dogArray[4].setType("����");
		
		for(int i=0; i<5; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		System.out.println("=================");
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}

	}

}
