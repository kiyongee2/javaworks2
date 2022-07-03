package casting;

import java.util.ArrayList;

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
	public static ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());
		
		for(Animal ani : animalList) {
			ani.move();
		}
		
		System.out.println("===원래 형으로 다운 캐스팅===");
		aTest.testCasting();  //메서드 호출
	}

	//animal 객체 추가
	public void addAnimal() {
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());
		
		for(Animal ani : animalList) {
			ani.move();
		}
	}
	
	//강제 타입 변환 메서드
	public void testCasting() {
		
		for(int i=0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
			
			if(animal instanceof Human) { //animal이 Human의 객체라면
				Human human = (Human)animal;  //Human 타입으로 강제 형변환
				human.readBook();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else {
				System.out.println("지원하지 않는 형입니다.");
			}
		}
	}
	
	//향상 for로 구현
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
				System.out.println("지원하지 않는 형입니다.");
			}
		}
	}
}

