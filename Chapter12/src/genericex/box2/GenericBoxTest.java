package genericex.box2;

public class GenericBoxTest {

	public static void main(String[] args) {
		
		//String type
		Box box = new Box();
		box.set("Good Luck!");
		String msg = (String) box.get();
		System.out.println(msg);
		
		//Class type
		box.set(new Apple("���"));
		Apple apple = (Apple) box.get();
		System.out.println(apple);
	}
}
