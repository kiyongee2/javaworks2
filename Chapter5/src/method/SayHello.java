package method;

public class SayHello {
	public static void main(String[] args) {
		hello();
		sayHello("�̶�");
		sayHello("����");
	}
	
	public static void hello() {
		System.out.println("Hello Java");
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello~ " + name);
	}
}
