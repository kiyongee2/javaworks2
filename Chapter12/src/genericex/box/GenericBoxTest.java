package genericex.box;

public class GenericBoxTest {

	public static void main(String[] args) {
		//String ��
		Box<String> box1 = new Box<>();
		box1.set("����� �����!");
		String msg = box1.get();
		System.out.println(msg);
		
		//Integer��
		Box<Integer> box2 = new Box<>();
		box2.set(10);
		Integer num = box2.get();
		System.out.println(num);
		
		//Apple Ŭ���� ��
		Box<Apple> box3 = new Box<>();
		box3.set(new Apple("���"));
		Apple apple = box3.get();
		System.out.println(apple);
	}
}
