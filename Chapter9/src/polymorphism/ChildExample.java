package polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();  //�ڽ�Ŭ������ �޼��尡 ȣ���
		//parent.method3(); //ȣ�� �Ұ�(�θ� ���� �޼����̹Ƿ�)
	}
}
