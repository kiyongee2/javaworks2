package genericex.box;

public class GenericBoxTest {

	public static void main(String[] args) {
		//String 형
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌어요!");
		String msg = box1.get();
		System.out.println(msg);
		
		//Integer형
		Box<Integer> box2 = new Box<>();
		box2.set(10);
		Integer num = box2.get();
		System.out.println(num);
		
		//Apple 클래스 형
		Box<Apple> box3 = new Box<>();
		box3.set(new Apple("사과"));
		Apple apple = box3.get();
		System.out.println(apple);
	}
}
