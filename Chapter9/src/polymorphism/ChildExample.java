package polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();  //자식클래스의 메서드가 호출됨
		//parent.method3(); //호출 불가(부모에 없는 메서드이므로)
	}
}
