package polymorphismex;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal human = new Human();
		human.move();
		
		Animal tiger = new Tiger();
		tiger.move();
		
		Animal eagle = new Eagle();
		eagle.move();
				
		System.out.println("=====moveAnimal() 메서드 호출=====");
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(human);
		aTest.moveAnimal(tiger);
		aTest.moveAnimal(eagle);
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}

